import java.util.HashMap;
import java.util.Map;

public class StringIsoGram {

    public static void main(String[] args) {
        
        String input = "codeDeCode"; 
        
        System.out.println(isIsoGram(input));
    }
    


    static boolean isIsoGram(String input){

        input = input.toLowerCase();
        boolean isogramCheck;

        Map<Character, Integer> charMap = new HashMap();
        char[] ch = input.toCharArray();

        for(char c : ch){

            charMap.computeIfPresent(c , (k,v)-> v+1 );
            charMap.computeIfAbsent(c, k->1);
            
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println(entry);
            if(entry.getValue()>1){
                return false;
            }
        }
        return true;
    }
}
