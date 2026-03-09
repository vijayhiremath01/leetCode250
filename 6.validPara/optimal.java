
// Link for Question is - https://leetcode.com/problems/valid-parentheses/description/
 
import java.util.* ;

public class optimal {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            // check and push
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else {
                // check is the stack is empty or not
                if(stack.isEmpty()){
                    return false ;
                }

                // now pop the ch from Stack
                char top = stack.pop();

                // check the pop and push is same or not
                if(ch == ')' && top != '(' ) return false ;
                if(ch == '}' && top != '{') return false ;
                if(ch == ']' && top != '[') return false ;
            }
        }
        // At the end the Stack should be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
          String s = "{[]}";
          System.out.println(isValid(s));
    }
}