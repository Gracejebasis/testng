package testng;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

	

	public class Excel_Dataprovider {

	    @Test(dataProvider = "excelData")
	    public void loginTest(String username, String password) {
	        System.out.println("Username: " + username + "  Password: " + password);
	    }

	    @DataProvider(name = "excelData")
	    public Object[][] getExcelData() throws IOException {
	        FileInputStream file = new FileInputStream("C:\\Users\\Grace\\Selenium\\testng\\src\\test\\resources\\testdata\\grace.xlsx");
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheet("sheet1");

	        int PhysicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	        int PhysicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();

	        Object[][] data = new Object[PhysicalNumberOfRows][PhysicalNumberOfCells];

	        for (int i = 0; i <PhysicalNumberOfRows; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < PhysicalNumberOfCells; j++) {
	                data[i][j] = row.getCell(j).toString();
	            }
	        }

	        workbook.close();
	        file.close();
	        return data;
	    }
	}


