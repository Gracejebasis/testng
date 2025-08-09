package testng;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Invocation {
	

    int count = 0;

    @Test(invocationCount = 5)
    public void flakyTest() {
        count++;
        System.out.println("Execution #" + count);

        // Simulate failure on 2nd and 4th runs
        if (count == 2 || count == 4) {
            Assert.fail("Simulated failure at run " + count);
        } else {
            System.out.println("Passed on run " + count);
        }
    }
}