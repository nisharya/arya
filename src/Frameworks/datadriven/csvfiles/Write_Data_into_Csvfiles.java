package Frameworks.datadriven.csvfiles;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Write_Data_into_Csvfiles {

	public static void main(String[] args) throws Exception  {
		
		String filepath="D:\\sources\\input.csv";
		FileWriter fw=new FileWriter(filepath);
		
		//To write date into csv file create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
		
		String header[]={"Username","Password"};
		writer.writeNext(header);
	
		String Line1[]={"aakash","Hello1234"};
		writer.writeNext(Line1);
	
		//save and close
		writer.close();

	}

}
