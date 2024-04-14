package javapractice;

public class ConstructorAndMethods 
{
	int x;
	String ms;
	// copy constructor
	public ConstructorAndMethods(int age, String name)
	{
	
	this.x=age;
	this.ms=name;
	}
	public ConstructorAndMethods(ConstructorAndMethods obj1)
	{
		this.x=obj1.x;
		this.ms=obj1.ms;
		
	}
	public static void main(String[] args) 
	{
		ConstructorAndMethods ms1 = new ConstructorAndMethods(25, "Manendra Patel");
		System.out.println(ms1.x);
		System.out.println(ms1.ms);
	} 
}	
	
//CONSTRUCTOR	
	/* public ConstructorAndMethods()
	{
		x=5;
		
	}
	public static void main(String[] args) 
	{
		ConstructorAndMethods ms = new ConstructorAndMethods();
		System.out.println(ms.x);		
	} */
	// Parameterized Constructor
	
	/*public ConstructorAndMethods(int ms)
	{
		x=5;
		y=ms;
		
	}
	public static void main(String[] args) 
	{
		ConstructorAndMethods ms = new ConstructorAndMethods(20);
		System.out.println(ms.x);
		System.out.println(ms.y);
	} */
	
