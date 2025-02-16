package programming;
public class CheckPlindromNumber {
    public static void main(String[] args) {
        int num = 4567654;
        int n = num;
        int result=0;
        while(num>0)
        {
            result = result*10+(num%10);
            num = num/10;
        }
        if(n==result){
            System.out.println("polindrom number");
        }
    }
}
