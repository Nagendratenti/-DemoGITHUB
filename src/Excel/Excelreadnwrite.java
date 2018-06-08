package Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadnwrite {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis =new FileInputStream("D:\\Excel\\mydata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("login");
		XSSFRow row=sheet.getRow(0);
			int colNum = row.getLastCellNum();
	       System.out.println("Total Number of Columns in the excel is : "+colNum);
	       int rowNum = sheet.getLastRowNum();
	       System.out.println("Total Number of Rows in the excel is : "+rowNum);
				wb.close();
		
	}

}
