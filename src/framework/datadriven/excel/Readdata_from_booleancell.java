package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_from_booleancell {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		//Target file location
		FileInputStream fi=new FileInputStream("Excel Data\\read.xlsx");
		System.out.println("file is located");
		
		//Create object for excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above book
		XSSFSheet sht=book.getSheet("DataTypes");
		
		//get row using sheet reference
		XSSFRow row=sht.getRow(1);
		Thread.sleep(3000);
		
		//Get boolean value[Start boolean with uppercase. By Default it convertinto nonprimitive] 
		Boolean flag=row.getCell(3).getBooleanCellValue();
		Thread.sleep(3000);
		if(flag==true)
		{
			System.out.println("Return boolean value true");
			
			//Convert Boolean value into string
			if(flag.toString().equalsIgnoreCase("true"))
			{
				System.out.println("Converted boolean to string");
			}
		}
		else
		{
			System.out.println("Return False");
		}
		
		
		

	}

}