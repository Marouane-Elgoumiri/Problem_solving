import java.util.*;

public class Main { 
    public static void main(String[] args){
        List<Integer> p = new ArrayList<>();
        p.add(5);
        p.add(2);
        p.add(1);
        p.add(3);
        p.add(4);
        List<Integer> result = permutationEquation(p);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        List<Integer> inverse = new ArrayList<>(n+1);
        List<Integer> result = new ArrayList<>(n);
        for(int i=0; i <= n; i++){
            inverse.add(0);
        }
        for(int i=1; i <= n; i++){
            inverse.set(p.get(i-1),i);
        }
        for(int j=1; j <= n; j++){
            int x = inverse.get(inverse.get(j));
            result.add(x);
        }
        return result;
    }
}
