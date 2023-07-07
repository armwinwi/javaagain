import java.util.*;

public class Method1 {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        name("Arm","Eiei");
        num(20,40);
        no1(10,30);
        int [] num1 = {10,20,30,40};
        System.out.println(no1(20,100));
        System.out.println(swaparr(num1, 2, 0));
        System.out.println(maxarray(num1));
        System.out.println(maxIn(num1));
        arrno(num1);
    }
    
    static void name(String fname,String lname){
        System.out.println("Fname = "+fname+" / Lname = "+lname);
    }
    static void num(int id , int no){
        System.out.println("Id is "+id+" no is "+no);
    }
    static int no1(int fno , int sno){
        int a;
        a = fno + sno; 
        return a;
    }
    static void arrno(int []arr){
        System.out.print("{");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

    static int maxarray(int []num1){
        int maxv = num1[0];
        for(int i=0;i<num1.length;i++){
            if(num1[i]>maxv){
                maxv=num1[i];
            }
        }
        return maxv;
        
    }
    static int maxIn(int []num1){
        int maxindex = 0;
        for (int i=0;i<num1.length;i++){
            if (num1[i]>maxindex){
                maxindex = i;
            }
        }
        return maxindex;
    }
    static int swaparr(int []num1,int x,int y){
        int temp = num1[x];
        num1[x] = num1[y];
        num1[y] = temp;
        return temp;
    }
}
