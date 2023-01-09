
public class Singledimension_runtimearray
{

	public static void main(String[] args) 
	{
		String browsers[]= {"edge","opera","chrome","safari","edge","firefox"};
		String chromebrowser=browsers[2];
		System.out.println(chromebrowser);
		System.out.println("lenght of aaray is"+browsers.length);
		
		int num[]={10,11,12,13,14};
		int x=num[4];
		System.out.println("5th number is"+x);
		
		Object obj[]= {"samsung",true,51000.00,2};
		String productname=(String) obj[0];
		boolean productstsatus=(boolean) obj[1];
		double productprice= (double) obj[2];
		
		int productunits=(int) obj[3];
		
		System.out.println(productname+productprice+productstsatus+productunits);
		
		


	}

}
