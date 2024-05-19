package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_getAllDataInColumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
	     Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	     
	     int lastRowIndex = sh.getLastRowNum();
		
	     for(int i=0; i<=lastRowIndex; i++)//forloop is for column
	     {
	    	 String value = sh.getRow(i).getCell(0).getStringCellValue();
	    	 System.out.println(value+" ");
	     }
	     
	     
	}


}
