import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number : ");
        int no=sc.nextInt();

        String res="";
        res = (no%2 ==0 ) ? no + " even no" : no + " odd no";
        System.out.println(res);

    }
    
}
