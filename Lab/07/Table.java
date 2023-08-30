import java.util.Scanner;
public class Table {

    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if (i % 10 == 0){
                System.out.println(i+" ");
                i++;
                
            }
            else if(i % 10 ==1){
                System.out.print(i+" ");
                i++;
            }
            else{
                
                System.out.print(i+" ");
                i++;
            
            }
                
            

        }
    }
}