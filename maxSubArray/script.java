package maxSubArray;
import java.util.*;

public class script {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int current = 0;

        for(int n : nums){
            if(current<0){
                current =0;
            }
            current += n;
            maxSub = Math.max(current, maxSub);
        }
        return maxSub;
    }

}
