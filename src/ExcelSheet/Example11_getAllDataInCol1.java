package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example11_getAllDataInCol1 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
	int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
		   CellType s1 = cellInfo.getCellType();
		   
		   if(s1==CellType.STRING)
		   {
			   String Value = cellInfo.getStringCellValue();
			   System.out.println(Value+" ");
		   }
		   else if (s1==CellType.NUMERIC)
		   {
			   double Value = cellInfo.getNumericCellValue();
			   System.out.println(Value+" ");
		   }
		   else if (s1==CellType.BOOLEAN)
		   {
			   boolean Value = cellInfo.getBooleanCellValue();
			   System.out.println(Value+" ");
		   }
		   
		}
		
	}

}
