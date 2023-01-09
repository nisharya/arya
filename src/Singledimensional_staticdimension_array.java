
public class Singledimensional_staticdimension_array 
{

	public static void main(String[] args) 
	{
		String browsers[]=new String[4];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="edge";
		browsers[3]="opera";
		System.out.println("3rd index value"+browsers[3]);
		
		String chromebrowser=browsers[0];
		System.out.println(chromebrowser);
		
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		int x=num[2];
		System.out.println(x);
		
		Object obj[]=new Object[4];
		obj[0]="iphone";
		obj[1]=true;
		obj[2]=125.00;
		obj[3]=2;
		
		String productname=(String) obj[0];
		boolean productstsatus=(boolean) obj[1];
		double productprice=(double) obj[2];
		int productunit=(int) obj[3];
		 System.out.println(productname+ productstsatus+ productprice+productunit);
		 
		 System.out.println(browsers.length);
		
		
				
				

	}

}
