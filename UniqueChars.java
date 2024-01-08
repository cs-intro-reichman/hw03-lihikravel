/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

   
    public static String uniqueChars(String s){
        char mid = (char)(s.charAt(0));
        String var1 = mid +  "";
        for (int i = 1; i < s.length(); i++){
            char var2 = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < var1.length(); j++){
                mid = var1.charAt(j);
            if (var2 == mid && mid != 32){
                unique = false;
                break;
            }
            }
        if (unique)
            var1 = var1 + var2;
            
        }
      
            
                 
        

        return var1 ;
    }
}
