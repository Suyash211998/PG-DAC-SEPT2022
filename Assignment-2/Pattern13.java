

class Pattern13{
	public static void main(String args[]){
		char ch = 'A';
		for(char i='E'; i>='A'; i--){
			for(char j='A'; j<='E'; j++){
				if(j<i){
					System.out.print(" ");
				}
				else{
					
					System.out.print(ch+" ");
					
				}
			}
			ch++;
			System.out.println();
		}
	}
}