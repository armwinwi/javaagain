public class Conv {
    public static void main(String[] args) {
	
	int i = 1 ;
	double cm ;
	
	
	System.out.println("Inches      Centimeters ");
	
	do{
	    cm = i*2.54 ;
	    System.out.print( i );
	    System.out.println("        "+cm );
	    i++;
	}while (i<=199);
}
}