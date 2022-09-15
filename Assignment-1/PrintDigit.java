import java.util.*;

class PrintDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num1 = sc.nextInt();
		String num =String.valueOf(num1);
		for(int i = 0; i<num.length(); i++){
			System.out.print(num.charAt(i)+ " ");
		}
	}
}