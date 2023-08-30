import java.util.*;
public class Fs {
    
    static int NumGen(int n){
    int i=1,count=0;

    // Iterate from 0 to N
    while(i<n+1)
    {
        if (i % 5 == 0 || i % 7 == 0){
           System.out.print(i + " ");
           count+=1;
           if(count % 10 == 0){
            System.out.println("");
           }
        }
        i++;
        
    
    }
    return n;
}
 
// Driver code
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int i=sc.nextInt();
    // Input goes here
     
    // Iterating over generator function
    NumGen(i);
}
}
