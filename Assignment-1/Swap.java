import java.util.*;

class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		  //a=6 b=4 a=a+b=10 b=a-b a=-b
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		System.out.println("Enter num1 = " + a);
		System.out.println("Enter num1 = "+ b);
	}
}