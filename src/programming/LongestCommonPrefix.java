package programming;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        String prev="";
        String str = "";
        for(int i=0;i<s.length();i++){
            str = str + s.charAt(i);
            int count = 0 ;
            for(int j=0;j<strs.length;j++){
                String s2 =strs[j];
                if(s2.charAt(i)==s.charAt(i))
                    count++;
            }
            if(strs.length==count)
                prev = str;

        }
        return prev;
    }

    public static void main(String[] args) {
        String [] strs = {"c","acc","ccc"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
