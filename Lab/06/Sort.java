import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter Num2 : ");
        int num2=sc.nextInt();
        System.out.print("Enter Num3 : ");
        int num3=sc.nextInt();

        int temp;
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if (num2 > num3) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}

		System.out.println("[" + num1 + ", " + num2 + ", " + num3 + "]");
    }
}
