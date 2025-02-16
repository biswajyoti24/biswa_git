package programming;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character,Integer> characterFrequecny = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int a =0;
            if(characterFrequecny.containsKey(s.charAt(i))){
                a = characterFrequecny.get(s.charAt(i)).intValue();
                characterFrequecny.put(s.charAt(i),a+1);
            }else{
                characterFrequecny.put(s.charAt(i),a+1);
            }

        }
        for(Character a : characterFrequecny.keySet())
            System.out.println(a+"->"+characterFrequecny.get(a));


    }
}
