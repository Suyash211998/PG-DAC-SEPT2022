import java.util.*;

class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		String num1 =String.valueOf(num);
		int n = num1.length()-1;
		boolean flag=true;
		for(int i = 0; i<(num1.length()/2-1); i++,n--){
			if(num1.charAt(i)!=num1.charAt(n)){
				flag=false;
				break;
			}
			flag=true;
		}
		if(flag==true) System.out.println("Number is a Palindrome");
		else System.out.println("Number is not a Palindrome");
	}
}