
class PatternStar9{
	public static void main(String args[]){
		int c = 0;
		for(int i=0; i<10; i++){
			c=i;
			if(c>4){
				c=9-c-1;
			}
			for(int j=5; j>0; j--){
				if(j>c+1){
					System.out.print(" ");   
				}  
				else{
					System.out.print("*");   
				}
			}
			
			System.out.println();   
		}
	}
}