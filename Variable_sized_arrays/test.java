package Variable_sized_arrays;

import java.util.*;

public class test {


class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            } 
            map.put(nums[i], false);
        }
        return false;
    }
}

