 package programming;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length()-1;i++){
            int count=0;
            for(int j=0;j<str.length()-1;j++){
                if(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)){
                    count++;
                }

            }
            if(count==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
