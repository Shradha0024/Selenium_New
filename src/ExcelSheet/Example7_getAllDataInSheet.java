package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example7_getAllDataInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
	     Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	     
	     int lastRowIndex = sh.getLastRowNum();
	     
	   //refrence of multi dimensional array
	     
	     for(int i=0; i<=lastRowIndex; i++)  //outer forloop -->rows
	     {
	    	 int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
	    	 
	    	 for(int j=0; j<=lastCellIndex; j++)//inner forloop for column
	    	 {
	    		 String value = sh.getRow(i).getCell(j).getStringCellValue();
	    		 System.out.print(value+" ");
	    	 }
	    	 System.out.println();
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
