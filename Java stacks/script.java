import java.util.*;

class script{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true; 
            for (int i = 0; i < input.length(); i++) {
                Character ch = input.charAt(i);
                
                if (ch == '{' || ch == '(' || ch == '[') {
                    stack.push(ch);
                } 
                else if (ch == '}' || ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break; 
                    }
                    char top = stack.pop();
                    if ((ch == '}' && top != '{') || 
                        (ch == ')' && top != '(') || 
                        (ch == ']' && top != '[')) {
                        isValid = false;
                        break; 
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
		
	}
}



