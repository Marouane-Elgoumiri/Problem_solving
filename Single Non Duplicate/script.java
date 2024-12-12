import java.util.HashSet;

public class script {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        script obj = new script(); // Create an instance of the script class
        System.out.println(obj.singleNonDuplicate(nums)); // Call the method on the instance
    }
    
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> seto = new HashSet<>();
        
        for(int i : nums){
            if(!seto.add(i)){
                seto.remove(i);
            }
        }
        
        return seto.iterator().next();
    }
}
