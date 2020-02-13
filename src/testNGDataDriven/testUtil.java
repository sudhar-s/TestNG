package testNGDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class testUtil
{
		
	static Workbook wb;
	static Sheet sh;
	
	public static Object[][] getDataFromExcel(String sheetname) throws IOException
	{
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream("E://Sel//Workspace//TestNG//src//testNGDataDriven//RegPageData.xlsx");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		sh = wb.getSheet(sheetname);
		
		Object[][] mydata = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0; i<sh.getLastRowNum(); i++)
		{
			for(int j=0; j<sh.getRow(0).getLastCellNum(); j++)
			{
				mydata[i][j] = sh.getRow(i+1).getCell(j).toString();
			}
		}
		return mydata;
	
	}
}