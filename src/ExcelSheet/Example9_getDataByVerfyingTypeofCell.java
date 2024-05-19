package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_getDataByVerfyingTypeofCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
	     Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	     
	     
	     Cell Cellinfo = sh.getRow(0).getCell(2);
	     CellType s1 = Cellinfo.getCellType();
	     
	     if(s1==CellType.STRING)
	     {
	    	String value = Cellinfo.getStringCellValue();
	    	System.out.println(value);
	     }
	     else if(s1==CellType.NUMERIC)
	     {
	    	 double value = Cellinfo.getNumericCellValue();
	    	 System.out.println(value);
	     }
	     else if(s1==CellType.BOOLEAN)
	     {
	    	 boolean value = Cellinfo.getBooleanCellValue();
	    	 System.out.println(value);
	     }
	     
	}
}
