package conditional_statements;

public class Switch_condition
{

	public static void main(String[] args) 
	{
		String month="feb";
		
		switch (month) 
		{
		case "jan":
			System.out.println("no discount");
			break;
			

		case "feb":
			System.out.println("half discount");
			break;
			
			case "mar":
				System.out.println("full discount");
				break;
				
		}

	}
}
