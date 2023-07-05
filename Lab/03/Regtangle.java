import java.util.Scanner;
public class Regtangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int le,wi,ar; //variable
        System.out.print("Enter length : ");
        le = sc.nextInt();
        System.out.print("Enter Width : ");
        wi = sc.nextInt();
        ar = le*wi;
        System.out.println("The area of Rectangle is " + ar);

    }
}