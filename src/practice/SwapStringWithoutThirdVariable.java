package practice;

public class SwapStringWithoutThirdVariable {
    public static void main(String[] args) {
        String s1= "abc";
        String s2 = "def";
        System.out.println(s1 + "  "+ s2);
        swapTwostring(s1,s2);
    }
   public static void swapTwostring(String s,String t){
        s=s.concat(t);
        t=s.substring(0,s.length()-t.length());
        s=s.substring(t.length());
       System.out.println(s + "  "+ t);

   }
}
