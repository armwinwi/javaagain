
public class Pyramid {
    public static void main(String[] args) {
        int max = 8;
        int pad = (int) Math.ceil(Math.log10(Math.pow(2, max) + 1)) + 2;
        for (int i = 0; i < max; i++) {
            for (int j = 1; j < max - i; j++) {
                System.out.print(pad(" ", pad));
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(pad(Math.pow(2, k), pad));
            }
            for (int k = i - 1; k >= 0; k--) {
                System.out.print(pad(Math.pow(2, k), pad));
            }
            System.out.println();
        }
    }
    
    public static String pad(double d, int l) {
        Integer i = (int) d;
        return pad(i.toString(), l);
    }
    
    public static String pad(String s, int l) {
        return String.format("%-" + l + "s", s);
    }
    
}