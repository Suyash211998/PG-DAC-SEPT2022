
import java.util.*;

class ReverseNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num1 = sc.nextInt();
		String num =String.valueOf(num1);
		for(int i =num.length()-1; i>=0; i--){
			System.out.print(num.charAt(i));
		}
		
	}
}