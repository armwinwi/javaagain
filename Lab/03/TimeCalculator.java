import java.util.Scanner;
public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d,h,m,s;
        System.out.print("Enter The time (Second) : ");
        s = sc.nextInt();
        if (s>=86400) {
            System.out.println(s/86400+" Day"); 
            s %= 86400;
        }
        if (s>=3600){
            System.out.println(s/3600+" Hour");
            s %= 3600;
        }
        if (s>=60){
            System.out.println(s/60+" Min");
            s %= 60;
        }
        System.out.println(s+" Second");

    }
}