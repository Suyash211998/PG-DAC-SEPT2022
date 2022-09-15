
import java.util.*;
class AddNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1= sc.nextInt();
		System.out.println("Enter num2 ");
		int num2= sc.nextInt();
		for(int i=0; i<num2; i++){
			num1++;
		}
		System.out.println("Sum = "+ num1);
	}
}