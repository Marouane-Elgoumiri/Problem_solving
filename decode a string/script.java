import java.util.Stack;
class Solution {
    public String decodeString(String s) {
        Stack<Integer> ints = new Stack();
        Stack<String> strings = new Stack();
        int index=0; String res="";
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                ints.push(count);
            }else if(s.charAt(index) == '['){
                strings.push(res);
                res = "";
                index++;
            }else if(s.charAt(index) == ']'){
                StringBuilder builder = new StringBuilder(strings.pop());
                int count = ints.pop();
                for(int i=0; i<count; i++){
                    builder.append(res);
                }
                res = builder.toString();
                index++;
            }else{
                res += s.charAt(index);
                index++;
            }
        }
        return res;
    }
}