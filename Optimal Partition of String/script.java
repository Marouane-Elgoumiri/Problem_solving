import java.util.HashSet;

class script{
    public static void main(String[] args){
        System.out.println();
    }
    public int partitionString(String s) {
        HashSet parti = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(parti.contains(c)){
                count++;
                parti.clear();
            }
            parti.add(c);
        }
        if(!parti.isEmpty()){
            count++;
        }
        return count;
    }
}

