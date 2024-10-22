package binary_search;

public class script {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int right =nums.length -1 ; int left =0;
        while(right >= left){
            int m = Math.floorDiv(left + right, 2);
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
