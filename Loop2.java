package assignment4;

public class Loop2 {
	public static void main(String []args){
	int  x = 0; 
	
	char k;
	 int i=1;
	while(i<=5){ //  given condition in while loop so if it is true it prints the char values 
		
		 
		k = 'a';
	    int j=1;// while loop shows the rows
		int d=0;
	    while (j<=5){ //
			// increasing the values
			if (i < 4) {
			
				if (j >= 4 - i && j <= 2 + i) {//taking if loop to print chars values it increment and decrement values
					                            //otherwise it prints spaces
					System.out.print(k);
					if (j < 3) {
						k++;
					} else {
						k--;
					}
				} else {
					System.out.print(" ");
				}
			} else {
				
				// decreasing the values and checking the given condition by taking if loop				
				if (j>i-3 && j <= 5-d) {
					
					System.out.print(k);
					if (j<3) {
						k++;
					} else {
						k--;
					}
				} else {
					System.out.print(" ");
					d++;
				}
			}
        j++;//closing the while loop of columns
		}

		System.out.println();//it is used to print in new line
	i++;//closing rows loop
	}
}	 
}

