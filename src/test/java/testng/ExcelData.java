package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	
	  @DataProvider(name = "excelData") 
	public static Object[][] excelRead_AllData() {
		 Object[][] data = null;
		try {
			File f = new File("C:\\Users\\Grace\\Selenium\\testng\\src\\test\\resources\\testdata\\grace.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			
			
			 int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	            int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();

	            data = new Object[physicalNumberOfRows - 1][physicalNumberOfCells];
	            for (int i = 1; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
                for (int j = 0; j < physicalNumberOfCells; j++) {
                    Cell cell = row.getCell(j);
                    int cellType = cell.getCellType();
                    if (cellType == 1) {
                        String stringCellValue = cell.getStringCellValue();
                        System.out.println(stringCellValue);
                        data[i - 1][j] = stringCellValue;
                    } else if (cellType == 0) {
                        if (DateUtil.isCellDateFormatted(cell)) {
                            Date dateCellValue = cell.getDateCellValue();
                            SimpleDateFormat sm = new SimpleDateFormat("MM/dd/yy");
                            String format = sm.format(dateCellValue);
                            System.out.println(format);
                            data[i - 1][j] = format;
                        } else {
                            double numericCellValue = cell.getNumericCellValue();
                            long l = (long) numericCellValue;
                            String valueOf = String.valueOf(l);
                            System.out.println(valueOf);
                            data[i - 1][j] = valueOf;
                        }
                    }
                }
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}