



class PatternStar13{
	public static void main(String args[]){
		int c=0;
		for(int i=0; i<9; i++){
			c=i;
			if(c>4){
				c=8-c;
			}
			for(int j=0; j<5; j++){
				if(j<c){
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