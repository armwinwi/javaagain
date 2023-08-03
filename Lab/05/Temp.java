import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Celcius : ");
        double cs=sc.nextDouble();
        double frhres = ( (cs * 9/5)+32);

        System.out.print("Fahrenheit : ");
        double frh=sc.nextDouble();
        double csres = (frh-32)*5/9;

        System.out.println("Fahrenheit is : "+frhres);
        System.out.println("Celcius is : "+csres);


    }
}

