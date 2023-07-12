import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1416;
        System.out.print("Enter radius : ");
        double ra = sc.nextDouble();

        ra *= 2.54;
        double vol = (4/3)*pi*Math.pow(ra,3);
        double sur = 4*pi*Math.pow(ra,2);
        System.out.println(Math.floor(vol*100)/100);
        System.out.println(Math.floor(sur*100)/100);
    }
}
