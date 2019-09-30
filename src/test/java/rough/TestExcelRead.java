package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelRead {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		 new TestExcelRead().excelReading("./src/test/resources/excel/Test.xlsx", "Sheet1");
		
	}
	
	public void excelReading(String filePath, String sheetName) throws InvalidFormatException, IOException
	{
		File f= new File(System.getProperty("user.dir")+filePath);
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		Sheet sheet=workbook.getSheet(sheetName);
		
		int totalRow=sheet.getLastRowNum()+1;
	//	System.out.println(totalRow);
		ArrayList<Object> list= new ArrayList<Object>();
		for(int i=1;i<totalRow;i++)
		{
			Row row=sheet.getRow(i);
			int cellCount=row.getLastCellNum();
			
			for(int j=0;j<cellCount;j++)
			{
				Cell cell= row.getCell(j);
				//System.out.println(cell.toString());
				list.add(cell.toString());
				
			}
		}
			
			System.out.println("===========================================");
			System.out.println(list);
			
		}
		
	}
	
	