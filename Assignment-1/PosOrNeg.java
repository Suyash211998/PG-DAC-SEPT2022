import java.util.*;

class PosOrNeg{
	
	public static void main(String args[]){
		
		Scanner sc  =  new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Postive number");
		}
		else if(num<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("neigther Postive nor negative number");
		}

		
	}
}