package Frameworks.testng;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel_to_dp {
	String FilePath="Excel Data\\read.xlsx";
	String sheetname="Datasheet";
	XSSFWorkbook book;
	XSSFSheet sht;
	
		
  @Test(dataProvider = "getdata",enabled=true)
  public void getuserdata(String name, String mobile) {
  }

  @DataProvider
  public String[][] getdata() throws Exception {
	FileInputStream fi=new FileInputStream(FilePath);
	book=new XSSFWorkbook(fi);
	sht=book.getSheet(sheetname);
	
	int rcount=sht.getLastRowNum();
	int ccount=sht.getRow(0).getLastCellNum();
	
	 String data[][]=new String[rcount+1][ccount];
	 for (int i = 0; i < rcount; i++) {
		 for (int j = 0; j <ccount; j++) {
			 data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			 
			
		}
		
	}
			 
	return data;
	  
	
   
  }
}
