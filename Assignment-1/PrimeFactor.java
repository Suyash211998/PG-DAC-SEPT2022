import java.util.*;

class PrimeFactor {
	static boolean prime(int num){
		boolean flag = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++){
			if(num%i==0 && prime(num/i)){
				System.out.print(num/i + " ");
				
			}
		}
		
	}
}