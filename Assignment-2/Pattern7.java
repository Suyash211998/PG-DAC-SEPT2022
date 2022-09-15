
class Pattern7{
	public static void main(String args[]){
		int c = 0;
		for(int i=5; i>0; i--){
			for(int j=0; j<5; j++){
				if(j<i-1){
					System.out.print(" ");   //  0 0 0 0 1 
				}							 //  0 0 0 1 0 2 
				else{						 //  0 0 1 0 2 0 3 
					c++;
					System.out.print(c+" ");   
				}
			}
			c = 0;
			System.out.println();   
		}
	}
}