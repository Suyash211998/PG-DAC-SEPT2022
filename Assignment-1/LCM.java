import java.util.*;

class LCM {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2 ");
		int num2 = sc.nextInt();
		int lcm =(num1>num2)? num1: num2;
		while(true){
			if(lcm%num1==0 && lcm%num2==0){
				System.out.println("LCM of these numbers is "+ lcm);
				break;
			}
			lcm++;
		}
		
		
	}
}