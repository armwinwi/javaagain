import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type ur number : ");
        int no=sc.nextInt();

        for (int i=1;i<=12;i++){
            System.out.println(no + " X "+i +" = "+ no*i);
        }
    }
}