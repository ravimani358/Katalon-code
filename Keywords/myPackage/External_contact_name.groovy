package myPackage

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kms.katalon.core.annotation.Keyword

public class External_contact_name {


	@Keyword
	public void demoKey(String name) throws IOException{

		FileInputStream fis = new FileInputStream("C:\\Users\\RavishankarN\\OneDrive - revature.com\\Desktop\\Katalon_auto\\Drivers\\Excel\\External_contact.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Create_Contact");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);
		Cell cell = row.createCell(0);
		cell.setCellValue(name);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\RavishankarN\\OneDrive - revature.com\\Desktop\\Katalon_auto\\Drivers\\Excel\\External_contact.xlsx");
		workbook.write(fos);
		fos.close();
	}
}