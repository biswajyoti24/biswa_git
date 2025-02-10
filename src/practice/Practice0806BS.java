package practice;

public class Practice0806BS {

    public static String validateTheString(String s){



        String []Str = s.split(" ");

        String Str1="" ;
        for (String s1: Str){
            String s2 = s1.toLowerCase();
            char ch = s2.charAt(0);
//            String s3 = s2.replace(s2.charAt(0),String.valueOf(ch).toUpperCase().charAt(0));

            String s3 = String.valueOf(ch).toUpperCase()+s2.substring(1);
//            Str1.append(s3).append(" ");
            Str1 = Str1+" "+s3;
        }

        return Str1;

    }

    public static void main(String[] args) {
        String s = "whatw ISs yOury dated of BIRTH?";
        String s2 = validateTheString(s);
        System.out.println(s2);
    }

}
