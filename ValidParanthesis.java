import java.util.*;

class ValidParanthhesis {
    public boolean isValid(String s) {
        if(s==null){
            return false;
        }
        if((s.length()&1)==1){
            return false;
        }

        Map<Character,Character> pairs=new HashMap<>();

        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');

        Deque<Character> stack=new ArrayDeque<>();

        for(char c:s.toCharArray()){
            if(pairs.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=  pairs.get(c)){
                    return false;
                }
            }
            else{
                    stack.push(c);
                }
        }
         return stack.isEmpty();
    }
   
}
