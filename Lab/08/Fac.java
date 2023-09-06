import java.util.*;
public class Fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int no = sc.nextInt();
        int fac=1;
        System.out.print(no+"!"+" = "); 
        if(no==1 || no == 0){
            System.out.print(fac);
            }
            else
            for(int i=no;i>=1;i--){
            
                System.out.print(i);
                if(i>1){
                    System.out.print(" X ");
                }else {
                    System.out.print("");
                }
            }
            for (int i=1; i<=no; i++) {
                fac = fac*i;
            }
            System.out.print(" = "+fac);
        
    }
}
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num : ");
//         int i = sc.nextInt();
//         int j = factorial(i); //Call the method
//         System.out.println(j); //Print result
//    }
  
//    public static int factorial(int i) { //Recursive method
//         if(i == 1 || i == 0)
//              return 1;
//         else
//             for (int j = 1; j <= i; j++) {
//                 int fa=1,fac=1;
//                 fac = fa * j;
//                 fa = fac;
            
//             }
//             return fac;
//    }