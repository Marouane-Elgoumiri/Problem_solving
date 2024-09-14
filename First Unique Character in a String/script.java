import java.util.*;

class Solution {

    public static void main(String[] args){
        String m = "loveleetcode";
        System.out.println(firstUniqChar(m));
    }

    public static int firstUniqChar(String s) {
        Hashtable<Character, Integer> map = new Hashtable<>();

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}