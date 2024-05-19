package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_getTypeofCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
	     Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	     
	     
	     CellType s1 = sh.getRow(0).getCell(2).getCellType();
	     
	     System.out.println(s1);
	     
	     
	     
	     
	     
	}

}
