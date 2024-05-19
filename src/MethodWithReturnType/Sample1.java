package MethodWithReturnType;

public class Sample1 
{
	public static void main(String[] args) 
	{
		 int num1=add(10, 20);
		 System.out.println(num1);
		 
		 System.out.println("---------Or---------");
		 
		 System.out.println(add(20, 30));
		 
		 System.out.println("-----------------------------------");
		 
		 Sample1 s1=new Sample1();
		 int num2=s1.mul(10,20);
		 System.out.println(num2);
		 
		 System.out.println("----------or--------");
		 
		 System.out.println(s1.mul(30, 40));
		 
		 System.out.println("-----------------------------------");
		 
		 String s3 = Sample2.convertNameToUpperCase("Pooja");
		  System.out.println(s3);
		  
		  System.out.println("-------or--------");
		  
		  System.out.println(Sample2.convertNameToUpperCase("pawan"));
		  
		  
		
	}
	
	//method with int return type
	
	public static int add(int a, int b)
	{
		int c=a+b;
		
		return c;
		
	}
	public int mul(int e, int d)
	{
		int m=e*d;
		return m;
		
	}
	
	

}
