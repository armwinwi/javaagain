/**
 * StringMeth
 */
public class StringMeth {

    public static void main(String[] args) {
        String data="Arm,Arm1,Arm2";
        String [] name=data.split(",");
        arr(name);
    }
    static void arr(String [] name){
        System.out.print("{");
        for (int i=0;i<name.length;i++){
            System.out.print(name[i]);
            if(i<name.length-1)
            System.out.print(",");
        }
        System.out.print("}");
    }
}