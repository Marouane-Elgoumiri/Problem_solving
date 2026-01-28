

public class Script {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        //  [1,2,3,4,5,6,7]

        //  [7,6,5,4,3,2,1]

        //  [6,7,1,2,3,4,5] 

        int l = 0, r = nums.length-1;
        while(r > l){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            r--; l++;
        }

        l = 0; r = k - 1;
        while(r > l){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            r--; l++;
        }

        l = k; r = nums.length-1;
        while(r > l){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            r--; l++;
        }
    }
}
