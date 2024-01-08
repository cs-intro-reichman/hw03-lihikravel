
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String s) {
     String str = "";
        for(int var3 = 0; var3 < s.length(); var3++) {
            char var2 = s.charAt(var3);
        if (s.charAt(var3) >= 'A' && s.charAt(var3) <= 'Z') {
            var2 = (char)(s.charAt(var3) + 32);
        }

        str = str + var2;
        }

        return str;
    }
}