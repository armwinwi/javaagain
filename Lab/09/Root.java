import java.util.*;
public class Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dis = distance(x1, y1, x2, y2);
        System.out.println("The distance is "+dis);
    }

    public static double distance(double x1,double y1,double x2,double y2){
        double res ;
        res = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y2-y1, 2));
        return res;
    }
}
