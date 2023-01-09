package css_selectors;

public class String_comparision_commands
{

	public static void main(String[] args) 
	{
		String act_res="Account Created Sucess";
		String exp_res="account Created Sucess";
		
		boolean flag=act_res.equals(exp_res);
		System.out.println("equal is"+flag);
		
		boolean flag1=exp_res.equalsIgnoreCase(act_res);
		System.out.println("equal ignore"+flag1);

		String status="Account 200 Created";
		System.out.println(status.contains("Account"));
		System.out.println(status.contains("Created"));
		System.out.println(status.contains("Account 200"));
		
		String mobile="123456789";
		int len=mobile.length();
		System.out.println("mobile length"+len);
		System.out.println(len==9);
		
		
		String accno="1234567890";
		String lastdigits=accno.substring(5);
		System.out.println("last digits"+lastdigits);
		String middledigits=accno.substring(4, 6);
		System.out.println("middle digits"+middledigits);
		
		String productprice="5000";
		System.out.println(productprice.substring(2));
		
		String pincode="500035";
		System.out.println("before trim"+pincode.length());
		String newpincode=pincode.trim();
		System.out.println("after trim"+newpincode.length());
		
		String var1="";
		String var2="hi";
		System.out.println("var1 empty status"+var1.isEmpty());
		System.out.println("var2 empty status"+var2.isEmpty());
		
		String accnu="1234567890";
		boolean flag5=accnu.startsWith("1234");
		System.out.println("start compare"+flag5);
		
		boolean flag6=accnu.endsWith("7890");
		System.out.println("end compare"+flag6);
		
		String browsername="chrome,firefox";
		char ch=browsername.charAt(5);
		System.out.println("characters at 5th"+ch);
		
		String toolname="WEBDRIVER";
		System.out.println(toolname.toLowerCase());
		
		String toolname1="chromedriver";
		System.out.println(toolname1.toUpperCase());
		
		String firstname="nishanth";
		String surname="j";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname);
		
		String rep=browsername.replace('r', 'o');
		System.out.println("after replace"+rep);
		System.out.println(browsername.replaceAll("o", "r"));
		
		String price="25.000";
		String newprice=price.replace("5", "").replace(".", "");
		int latest=Integer.parseInt(newprice);
		System.out.println(latest);
		
		String browsers="chrome,firefox,safari";
		String arr[]=browsers.split(",");
		System.out.println(arr[0]+" "+arr[2]+" "+arr[1]);
		
		
		
		
	}

}
