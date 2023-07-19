import java.util.Scanner;
public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s; //variable
        System.out.print("Enter The time (Second) : ");
        s = sc.nextInt();
        if (s>=86400) {
            System.out.println(s/86400+" Day"); 
            s %= 86400;
        }
        else{
            System.out.println("0 Day"); 
        }
        if (s>=3600){
            System.out.println(s/3600+" Hour");
            s %= 3600;
        }
        else{
            System.out.println("0 Hour"); 
        }
        if (s>=60){
            System.out.println(s/60+" Min");
            s %= 60;
        }else{
            System.out.println("0 Min"); 
        }
        System.out.println(s+" Second");

    }
}