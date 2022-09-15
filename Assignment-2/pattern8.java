

class Pattern8{
	public static void main(String args[]){
		int c = 0;
		for(int i=5; i>0; i--){
			c=i;
			for(int j=0; j<5; j++){
				if(j<i-1){
					System.out.print(" ");      0 0 0 0 5
				}							 	0 0 0 
				else{						 
					System.out.print(c+" ");   
					c++;
				}
			}
			System.out.println();   
		}
	}
}