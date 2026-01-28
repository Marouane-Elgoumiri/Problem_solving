

public class script {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Run Baby run: "  + maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            max = Math.max(max, h * (j - i));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
