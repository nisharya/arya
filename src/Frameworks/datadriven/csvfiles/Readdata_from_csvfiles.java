package Frameworks.datadriven.csvfiles;


import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Readdata_from_csvfiles {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D:\\sources\\input.csv");
		System.out.println("file is located");
		
		CSVReader reader=new CSVReader(fr);
		
		String rec1[]=reader.readNext();
		System.out.println(rec1[0]+" "+rec1[1]);
		
		String rec2[]=reader.readNext();
		System.out.println(rec2[0]+" "+rec2[1]);
		
		String record[];
		while ((record=reader.readNext())!=null) 
		{
			System.out.println(record[0]+" "+record[1]);
		}

	

}
}
