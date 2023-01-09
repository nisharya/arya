package oops.encapsulation;

public class User1 {

	public static void main(String[] args) 
	{
		Encaps obj=new Encaps();
		System.out.println(obj.empid);
		obj.empid="MQ0005";
		System.out.println(obj.empid);
		
		obj.setname("mindq");
		System.out.println(obj.getname());
		

		obj.setmobile("9081745342");
		System.out.println(obj.getmobile());
	}

}
