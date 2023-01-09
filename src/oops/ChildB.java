package oops;

public class ChildB extends ChildA

{
	public void method3()
	{
		method1();
		method2();
	}

	public static void main(String[] args) 
	{
		ChildA obj=new ChildB();
		obj.method1();
		obj.method2();
		
		Parent ref=new ChildB();
		ref.method1();
		

	}
}
