import java.util.*;
class DigitSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>10){
			sum+=num%10;
			num=num/10;
		}
		sum=sum+num;
		System.out.println("sum is "+sum);
		
	}
}