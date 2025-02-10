 package programming;

import java.util.Scanner;

public class stringReverseProgramming {
    public static void main(String [] args){
        Scanner dc = new Scanner(System.in);
        System.out.println("Entrer a sring to reverse:");
        String d = dc.nextLine();
        StringBuilder sb = new StringBuilder(d);
        System.out.println("the reverse string is :"+ sb.reverse().toString());
        String c = sb.reverse().toString();
        if(d==c){
            System.out.println("'"+d+"'"+" is a n armstrong string");
        }
        StringInterPolation si = new StringInterPolation();
        System.out.println("Enter  two String :");
        String s1=dc.nextLine();
        System.out.println("Enter second string :");
        String s2 = dc.nextLine();
        Boolean chkstr = si.checkArmstrongoftwostring(s1,s2);
        if(chkstr){
            System.out.println("Two string are armstrong string");
        }
    }
}
