public class script {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right >= left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
