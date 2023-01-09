
public class Doubledimension_staticarray
{

	public static void main(String[] args) 
	{
		String data[][]=new String[2][2];
		
		data[0][0]="arun";
		data[0][1]="1234";
		
		data[1][0]="padma";
		data[1][1]="0987";
		
		String maid=data[1][0];
		
		System.out.println(maid);
		System.out.println("row lenth"+data.length);

	}

}
