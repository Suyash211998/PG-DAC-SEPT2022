
class Pattern11{
	public static void main(String args[]){
		
		for(int i=5; i>0; i--){
			for(int j=0; j<5; j++){
				if(j<i-1){
					System.out.print(" ");   //  0 0 0 0 1 
				}							 //  0 0 0 1 0 2 
				else{						 //  0 0 1 0 2 0 3 
					System.out.print("*");
					if(j<4){
						System.out.print("*");
					}
					
				}
			}
			
			System.out.println();   
		}
	}
}