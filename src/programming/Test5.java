package programming;

public class Test5 {
    public static void main(String[] args) {
        byte b;
        int i = 258;
        double d = 325.25;
        b = (byte) i;
        System.out.println("b="+b);
        i= (int)d;
        System.out.println("i="+i);
        b=(byte)d;
        System.out.println("b="+b);
    }
}
