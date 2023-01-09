package practise;

public class sample
{
	public sample()
	{
		System.out.println("initialize data to method");
	}
  public void methodA()
  {
	  System.out.println("methodA executed");
  }

 public static void main(String[] args)
    {
		new sample().methodA();

	}

}
