package oops;

public class ChildA extends Parent
{
	String email="nishu@gmail.com";
	
	public void method2()
	{
		System.out.println(name);
		method1();
	}
	
	public static void main(String[] args) 
	{
		ChildA obj=new ChildA();
		obj.method1();
		obj.method2();
		
		Parent ref=new ChildA();
		ref.method1();
	}

}
