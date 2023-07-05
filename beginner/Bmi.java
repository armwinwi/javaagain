import java.util.Scanner;
import java.lang.Math;
class Bmi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----BMI Program----");
        System.out.print("What is ur Weight : ");
        double W=sc.nextDouble();

        System.out.print("What is ur Height : ");
        double H=sc.nextDouble();
        double Height = H/100;

        double bmi = W / Math.pow(Height,2);

        System.out.println("Ur BMI is : "+bmi);

        if (bmi>30){
            System.out.println("Ur อ้วนมาก");
        }
        else if (bmi>=25){
            System.out.println("Ur อ้วน");
        }
        else if (bmi>=18.6){
            System.out.println("Ur Normal");
        }
        else if (bmi<18.6){
            System.out.println("Ur ผอม");
        }
        System.out.print("-------------------------");


    }
}