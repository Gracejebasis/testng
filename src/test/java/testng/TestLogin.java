package testng;

import org.testng.annotations.Test;

public class TestLogin {

    @Test(dataProvider = "excelData", dataProviderClass = ExcelData.class)
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + " | Password: " + password);
        // Your login logic
    }
}