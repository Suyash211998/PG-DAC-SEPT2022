
class Print1to10{
	public static int print(int num){
		if(num>10){
			return 1;
		}
		else{
			System.out.println(num);
			return (print(num+1));
		}
		
	}
	public static void main(String args[]){
		print(1);
	}
}