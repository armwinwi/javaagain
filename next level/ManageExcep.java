public class ManageExcep {
    public static void main(String[] args) {
        int a=2,b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("NOooo");
        }finally{
            System.out.println("Hahaha");
        }
    }
}
