package Frameworks.datadriven.csvfiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Csv_readdata_usingfiles {

	private static CSVReader reader;

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("D:\\sources\\input.csv");
		System.out.println("file is located");
		
		reader = new CSVReader(fr);
		
		List<String[]> list=reader.readAll();
		System.out.println(list.get(0));
		
		for (String[] Eachrecord : list) {
			
			System.out.println(Eachrecord[0]+"    "+Eachrecord[1]);

		}
		
			
		
		
		

	}

}
