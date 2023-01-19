package Paramitrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\abhij\\OneDrive\\Documents\\datasheet.xlsx");
	double data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data);
}
}
