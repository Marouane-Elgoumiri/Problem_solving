import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for(int num : nums){
            uniqueNums.add(num);
        }
        Integer[] uniqueArray = uniqueNums.toArray(new Integer[0]);
        Arrays.sort(uniqueArray, Collections.reverseOrder());
        if(uniqueArray.length < 3){
            return uniqueArray[0];
        }
        return uniqueArray[2];
    }
}