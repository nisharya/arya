package framework.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_from_cellvalue {

	public static <XSSFWorkbook> void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("Excel Data\\read.xlsx");
		System.out.println("file is located");
		
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		XSSFSheet sht=((Object) book).getSheet("sheet1");
		XSSFRow row=sht.getRow(1);
		Date date=row.getCell(4).getDateCellValue();
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date));
		
		
		

	}

}
