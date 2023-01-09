package css_selectors;

public class Global_instation_of_variables
{
	int a=100;
	
	public void method1() 
	{
		a=200;
		System.out.println(a);

	
	}
		
	
	

	public static void main(String[] args) 
	{
		Global_instation_of_variables obj=new Global_instation_of_variables();
		System.out.println(obj.a);
		obj.method1();
		System.out.println(obj.a);
		
		Global_instation_of_variables obj1=new Global_instation_of_variables();
		System.out.println(obj1.a);
	}

}
