class Solution {
    public static void main(String[] args){
        String m = "15";
        String n = "200";
        System.out.println(addStrings(m,n));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int j = num2.length()-1; int i = num1.length()-1;
        int carry = 0; int sum=0;
        while (i>= 0 || j>=0 || carry>0){
            int nur1 = (i>=0) ? num1.charAt(i--) - '0': 0;
            int nur2 = (j>=0) ? num2.charAt(j--) - '0': 0;
            sum = nur1 + nur2 + carry;
            str.append(sum % 10);
            carry = sum / 10;
        }
    return str.reverse().toString();
    }

   
}

