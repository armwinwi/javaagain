import java.util.Scanner;
public class Twonum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first num : ");
        int fno=sc.nextInt();
        System.out.print("Enter second num : ");
        int sno=sc.nextInt();

        if(fno>sno){
            System.out.print("The first number is greater than the second");
        }
        if(sno>fno){
            System.out.print("The first number is no greater than the second");
        }else{
            System.out.print("These two number are equa");
        }
    }
}