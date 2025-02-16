package programming;

import java.util.Scanner;

public class StringPolindromeTest1 {
    public String longestPalindrome(String s) {
        String s1 = "";
        String s2 ="";
        String prev = "";
        for(int i=0; i<s.length();i++){
            for(int j=0;j<s.length();j++){
                s1="";
                s2="";
                for(int k=i;k<=j;k++)
                    s1= s1+s.charAt(k);

                System.out.println(s1);
                for(int l=s1.length()-1;l>=0;l--){
                    s2=s2+s1.charAt(l);
                }
                System.out.println(s2);
                if(s1.equals(s2) && prev.length()<=s1.length())
                    prev = s1;


            }
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringPolindromeTest1 spt1 = new StringPolindromeTest1();
        System.out.println(spt1.longestPalindrome(str));
    }
}
