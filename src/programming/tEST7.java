package programming;

import java.util.Scanner;

public class tEST7  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.toLowerCase().split(" ");
        String[] result = new String[str1.length];
        int i = 0;
        for(String ws : str1){
            result[i] = ws.replace(ws.charAt(0),Character.toUpperCase(ws.charAt(0)));
            i++;
        }
        for(String s : result){
            System.out.print(s+" ");
        }
    }
}
