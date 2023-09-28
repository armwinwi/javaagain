
public class Max {
    public static void main(String[] args) {
        int x=9,y=7,i=5,j=2;
        int m = cal(i, j,x,y);
        System.out.println("The Maximum between "+x+" "+y+" "+i+" "+j+" is "+m);
    }
    public static int cal(int num1, int num2, int num3, int num4) { 
        int result = num1; 
        if (num2>result) 
            result = num2; 
        if (num3>result)
            result = num3; 
        if (num4>result)
            result = num4;
        
        return result;
    }
}
