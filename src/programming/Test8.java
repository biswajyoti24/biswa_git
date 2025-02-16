package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2 = sc.nextLine();
        CheckAnagram(str1,str2);
    }

    private static void CheckAnagram(String str1, String str2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0;i<str1.length();i++){
            int j = (int) str1.charAt(i)-97;
            count1[j]++;
        }
        for(int i=0;i<26;i++) {
            System.out.print(count1[i]+" ");
        }
        for(int i=0;i<str2.length();i++){
            int j = (int) str2.charAt(i)-97;
            count1[j]--;
            count2[j]++;
        }
        System.out.println("");
        for(int i=0;i<26;i++) {
            System.out.print(count2[i]+" ");
        }
        /*for(int i=0;i<26;i++){
           if(count1[i]>=1){
               System.out.println("The given two string are not ana gram");
               break;
           }

        }*/
        if (Arrays.equals(count1,count2))
            System.out.println("The given two string are  anagram");
    }
}
