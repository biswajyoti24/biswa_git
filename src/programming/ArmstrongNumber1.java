package programming;

public class ArmstrongNumber1 {
    public static boolean isPalindrome(int x) {
        int a =x;
        int p =0;
        while(a>0)
        {
            int ab= a%10;
            p=p*10+ab;
            a= a/10;
        }
        if(x==p)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = -121;
        Boolean b = isPalindrome(n);
        if(b)
            System.out.println(n+" is a polindrom number.");
    }
}
