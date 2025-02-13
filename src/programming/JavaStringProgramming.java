package programming;

import java.util.Scanner;

public class JavaStringProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = swapingPairsOfCharacter(str);
        System.out.println(str1);
    }
    public static String swapingPairsOfCharacter(String str){
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length()-1;i=i+2){
            char temp = ch[i];
            ch[i]=ch[i+1];
            ch[i+1] = temp;
        }
        return  new String(ch);
    }
}
