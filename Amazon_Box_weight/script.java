import java.util.*;

class script{
    public static void main(String[] args){

    }
    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder());
        List<Integer> setA = new ArrayList<>();
        
        long sumA = 0;
        long sumB = 0;
        
        // Calculate the total sum of the array
        for (Integer num : arr) {
            sumB += num;
        }

        // Iterate 
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sumA += num;
            setA.add(num);
            sumB -= num;
            if (sumA > sumB) {
                break;
            }
        }

        // Since we added elements from largest to smallest, reverse the list to maintain order
        Collections.reverse(setA);
        return setA;
    }
}