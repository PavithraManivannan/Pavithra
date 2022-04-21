package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {

		int a = 0, b = 1;
		
		System.out.println(a);
		
		for (int i = 0; i < 10; i++)
		{
    i=a+b;
     System.out.println(i);
  
     a=b;
     b=i;
	}
	}
}
