

class Pattern16{
	public static void main(String args[]){
		int c = 5;
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(c +" ");
				c--;
			}
			c=5;
			System.out.println();
		}
	}
}