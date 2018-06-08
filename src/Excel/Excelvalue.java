package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelvalue {

	public static void main(String[] args) throws IOException  {
		FileInputStream zz=new FileInputStream("D:\\Excel\\mydata.xlsx");
		XSSFWorkbook xx=new XSSFWorkbook(zz);
		XSSFSheet sheet=xx.getSheet("login");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		xx.close();

	}

}
