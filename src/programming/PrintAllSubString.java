package programming;

import java.util.Scanner;

public class PrintAllSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        int count  =0;
        for(int a =0;a<str.length();a++) {
           for(int j=0;j<str.length();j++){
               str1 = "";
               for(int k=a;k<=j;k++)
                   str1 = str1 + str.charAt(k);
               System.out.println(str1);
               for(int l=0;l<str1.length();l++){
//                str1 = "";
                   count  =0;
                   for(int m=l;m<str1.length();m++)
                       if(str1.charAt(l)==str1.charAt(m))
                           count++;
                   if(count>1)
                       break;
               }
               if (count<=1 && str2.length()<str1.length()){
                   str2=str1;

               }
           }

            System.out.println();
        }
        System.out.println(str2);
    }
}
