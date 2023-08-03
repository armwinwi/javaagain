import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls select trigonometric function ");
        System.out.print("1.sine 2.cosine 3.tangent 4.hyperbolic sine 5.hyperbolic cosin 6.hyperbolic tan : ");
        int menu = sc.nextInt();
        System.out.print("Enter num of degree : ");
        double num=sc.nextDouble();
        switch (menu){
            case 1:
                System.out.println(Math.sin(num));
                break;
            case 2:
                System.out.println(Math.cos(num));
                break;
            case 3:
                System.out.println(Math.tan(num));
                break;
            case 4:
                System.out.println(Math.sinh(num));
                break;
            case 5:
                System.out.println(Math.cosh(num));
                break;
            case 6:
                System.out.println(Math.tanh(num));
                break;
            
            default:
                System.out.println("You put invalid choice");
                    break;
        }
    }
}
