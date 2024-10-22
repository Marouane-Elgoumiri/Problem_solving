
public class script {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for(int i=0; i<= haystack.length()-needle.length(); i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
