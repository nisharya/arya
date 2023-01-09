
public class Doubledimension_runtimearray 
{

	public static void main(String[] args) 
	{
		String data[][]=
			{
					{"iphone","64gb","23"},
					{"samsung","32gb",null},
					{"vivo","64gb",null},
					
			};
		System.out.println(data[0][2]);
		
		
		Object obj[][]=
			{
					new Object[] {"iphone",true},
					new Object[] {"samsung",true},
					new Object[] {"oneplus",false},
					new Object[] {"oppo",true},
					
			};
		
		System.out.println(obj[1][0]);
		
		String samsung=(String) obj[1][0];
		System.out.println(samsung);
			}
		}


