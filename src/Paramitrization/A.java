package Paramitrization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
	FileInputStream file =new FileInputStream("C:\\Users\\abhij\\OneDrive\\Documents\\datasheet.xlsx");
	String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
