package binary_search;

public class script {
    
        public int search(int[] nums, int target) {
            int right =nums.length -1 ; int left =0;
            while(right >= left){
                int m = left + (right - left)/2;
                if(target == nums[m]){
                    return m;
                }
                if(target > nums[m]){
                    left = m + 1; 
                }else{
                    right = m - 1;
                }
            }
            return -1;
        }
}
