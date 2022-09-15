import java.util.*;
class Smallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a ");
		int a = sc.nextInt();
		System.out.println("Enter number b ");
		int b = sc.nextInt();
		System.out.println("Enter number c ");
		int c = sc.nextInt();
		int smallest=0;
		if(a<=b && a<=c){
			smallest=a;
		}
		else if(b<=a && b<=c){
			smallest=b;
		}
		else if(c>=a && c>=b){
			smallest=c;
		}
		System.out.println("Smallest Number is  " + smallest);
	}
}