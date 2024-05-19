package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getColumnSizeInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
	 
		
		short Colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(Colsize);
		
	}

}
