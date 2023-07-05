import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type your name : ");
        String name=sc.nextLine();

  
        System.out.print("What is ur BD? : ");
        int bd = sc.nextInt(); 

        System.out.println("My name is : " +name);
        System.out.println("My BD is : " +bd);
    }
}
        