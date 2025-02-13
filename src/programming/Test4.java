package programming;

public class Test4 {
    public static void main(String[] args) {
        int x=0;
        for(int i=0;i<5;i++){
            if(i%2==0){
                continue;
            }
            x +=i;
        }
        System.out.println(x);
    }
}
