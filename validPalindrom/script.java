package validPalindrom;

import java.util.*;


class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0; int p2 = s.length() -1;
        s = s.toLowerCase();
        while(p2 > p1){
            char l = s.charAt(p1) , h = s.charAt(p2);
            if(!Character.isLetterOrDigit(l)) p1++;
            else if(!Character.isLetterOrDigit(h)) p2--;
            else {
               if(Character.toLowerCase(l)!=Character.toLowerCase(h)) return false;
               p1++; p2--;
           }  
        }
        return true;
    }
}
