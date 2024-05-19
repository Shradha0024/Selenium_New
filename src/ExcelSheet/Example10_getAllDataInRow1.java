package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example10_getAllDataInRow1 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan selenium excel.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastCellIndex; i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
		   CellType s1 = cellInfo.getCellType();
		   
		   if(s1==CellType.STRING)
		   {
			   String Value = cellInfo.getStringCellValue();
			   System.out.print(Value+" ");
		   }
		   else if (s1==CellType.NUMERIC)
		   {
			   double Value = cellInfo.getNumericCellValue();
			   System.out.print(Value+" ");
		   }
		   else if (s1==CellType.BOOLEAN)
		   {
			   boolean Value = cellInfo.getBooleanCellValue();
			   System.out.print(Value+" ");
		   }
		   
		}
		
	}

}
