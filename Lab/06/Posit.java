import java.util.Scanner;
public class Posit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Angel from the Positive X : ");
        int x = sc.nextInt();

        if (x <= 90){
            if(x == 90 ){
                System.out.println("90 degree axis");
            }else
            if (x == 0){
                System.out.println("0 degree axis");
            }else
            System.out.println("I");
            
        }else if(x <= 180){

            if(x == 180){
                System.out.println("180 degree axis");
            }else
            System.out.println("II");
        }else if(x <= 270){

            if(x == 270){
                System.out.println("270 degree axis");
            }else
            System.out.println("III");
        }else if(x <= 360){

            if(x == 360){
                System.out.println("360 degree axis");
            }else
            System.out.println("IV");
        }

    }
}