package javapractice;

public class swap {

	public static void main(String[] args) 
	{
		int a=20;
		int b=50;
		int c;
		//Third variable
		/*c=b;
		b=a;
		a=c;
		
		System.out.println("Swap: A"+ a);
		System.out.println("Swap: B"+ b);
			*/
		//Without 3rd Variable
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		System.out.println("Swap: A"+ a);
		System.out.println("Swap: B"+ b);
		

	}

}
