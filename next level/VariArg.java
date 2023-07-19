public class VariArg {
    public static void main(String[] args) {
        summa(10,40,20,50);
    }
    static void summa(int...number){
        int sum=0;
        for (int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.print(sum);
    }
}
