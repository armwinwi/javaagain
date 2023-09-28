import java.util.*;
public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("c to convert F to C");
        System.out.println("f to convert C to F");      
        System.out.println("e to exit programs");  
        System.out.print("Choose the choice : ");
        char temp=sc.next().charAt(0);
        switch (temp) {
            case 'c':
                System.out.print("Input F : ");
                double f=sc.nextDouble();
                double cels =cel(f);
                System.out.println(cels);
                continue;
            case 'f':
                System.out.print("Input C : ");
                double c=sc.nextDouble();
                double fah =fah(c);
                System.out.println(fah);
                continue;
            case 'e':
                System.exit(0);
            default:
                break;
        }
        }while(true);

    }
    public static double cel(double f){
        double c = (f-32)*5/9;
        return c ;
    }
    public static double fah(double c){
        double f = ( (c * 9/5)+32);
        return f ;
    }
}
