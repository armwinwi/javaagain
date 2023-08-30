import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The time (Second) : ");
        int s = sc.nextInt();
        System.out.println(s/86000);
        s %= 86400;
        System.out.println(s/3600);
        s %= 3600;
        System.out.println(s/60);
        s %= 60;
        System.out.println(s);
    }
}
