import java.util.Scanner;

class FactorialRec{
	
	static int fact(int num){
		if(num==0 || num==1){
			return 1;
		}
		else{
			return (num*fact(num-1));
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
	
}