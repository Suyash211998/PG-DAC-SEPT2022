


class Pattern10{
	public static void main(String args[]){
		char ch = 'A';
		for(char i='E'; i>='A'; i--){
			ch=i;
			for(int j='A'; j<='E'; j++){
				if(j<i){
					System.out.print(" ");      
				}							 	
				else{	
					System.out.print(ch+" ");   
					ch++;
					
				}
			}
			System.out.println();   
		}
	}
}