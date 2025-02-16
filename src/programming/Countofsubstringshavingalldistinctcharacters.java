package programming;

import java.util.Scanner;

public class Countofsubstringshavingalldistinctcharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i=0;i<str.length()-1;i++){
            String s ="";
            for(int j=i;j<str.length();j++){
                s = s+str.charAt(j);
                System.out.println(s);
                if(checkUniqueCharacterString(s))
                    count++;

            }

        }
        System.out.println("Number of non repeating character substring is : "+count);
    }

    private static boolean checkUniqueCharacterString(String s) {
        Boolean b = true;
        for(int i=0;i<s.length()-1;i++){
            int count=0;
            for(int j =0 ;j<s.length()-1;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                    count++;
                if(count>1){
                    b =  false;
                    break;
                }

            }

        }
        return  b;
    }

}
