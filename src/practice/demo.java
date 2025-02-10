package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        System.out.println("Write a java program to print the First Not Repeated Char in string using streams");
        String s  = "Write a java program to print the First Not Repeated Char in string using streams";
//        System.out.println(s);

       /* List<char[]> ch = new ArrayList<Char>();
        ch = Arrays.asList(s.toCharArray());
        Set s1 = ch.stream().collect(Collectors.toSet);



        for(char[] ch : s1)
        System.out.println(ch);*/
        /*char []charr = s.toCharArray();
        System.out.println(charr[0]);
//        Set<char []> chs = Arrays.asList(charr).stream().collect(Collectors.toSet());

        for (char[] ch : chs){
            System.out.println(ch);
        }
*/
        char []charr = s.toCharArray();
        Set<char []> chs = Arrays.asList(charr).stream().distinct().collect(Collectors.toSet());

        for (char[] ch : chs){
            System.out.println(ch);
        }
        List<Character> ch1 = new ArrayList<Character>();
        List<Character> chList1 = new ArrayList<Character>();
       for(char ch2 : s.toCharArray()){
           chList1.add(ch2);
       }
        System.out.println(chList1.stream().map(x-> x));
//        for(char[] chg : Arrays.asList(charr).stream().distinct())
        List<Character> ch = new ArrayList<Character>();
        for(int i=0;i<s.length()-1;i++){
            int count = 0;
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(i) == s.charAt(j)){
                    count= count+1;
                }

            }
            if(count<2){
                ch.add(s.charAt(i));
            }

        }

        System.out.println(ch);

    }

}
