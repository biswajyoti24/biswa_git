package programming;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int num1=num;
        int n = num;
        int result=0;
        int count =0 ;
        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println(count);
        while(n>0){
            int x = n%10;
            int multi = 1;
            for(int i=0; i<count;i++)
                multi = multi*x;
            result=result+multi;
            n = n/10;

        }

        if(result==num1)
            System.out.println("Armstrong number"+result);
    }
}
