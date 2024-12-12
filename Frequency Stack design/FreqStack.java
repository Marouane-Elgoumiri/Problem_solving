// Source: https://leetcode.com/problems/maximum-frequency-stack/
// Time Complexity: O(1) for push and pop
// Space Complexity: O(n)

import java.util.*;

class FreqStack {
    
    private Map<Integer, Integer> FreqMap;
    private Map<Integer, Stack<Integer>> GroupMap;
    private int maxFreq; 
    
    public FreqStack() {
        FreqMap = new HashMap<>();
        GroupMap = new HashMap<>();
        maxFreq = 0;
    }

    // Setters:

    public void setGroupMap(Map<Integer, Stack<Integer>> map){
        GroupMap = map;
    }
    public void setFreqMap(Map<Integer, Integer> map){
        FreqMap = map;
    }
    public void setMaxFreq(int freq){
        maxFreq = freq;
    }

    // Getters:

    public Map<Integer, Stack<Integer>> getGroupMap(){
        return GroupMap;
    }
    public Map<Integer, Integer> getFreqMap(){
        return FreqMap;
    }
    public int getMaxFreq(){
        return maxFreq;
    }

    // Methods:
    
    public void push(int val) {
        
        int freq = FreqMap.getOrDefault(val, 0) +1;
        FreqMap.put(val,freq);
        
        if(freq > maxFreq){
            maxFreq = freq;
        }
        
        GroupMap.putIfAbsent(freq, new Stack<>());
        GroupMap.get(freq).push(val);
        
    }
    
    public int pop() {
        Stack<Integer> stack = GroupMap.get(maxFreq);
        int val = stack.pop();
        
        FreqMap.put(val, FreqMap.get(val)-1);
        
        if(stack.isEmpty()){
            maxFreq--;
        }
        
        return val;
    }
}

class child extends FreqStack {
    public static void main(String[] args) {
        FreqStack obj = new FreqStack();

        obj.push(5);
        obj.push(7);
        obj.push(5);
        obj.push(7);
        obj.push(4);
        obj.push(5);

        System.out.println("Stack elements by frequency:");
        for (int i = obj.getMaxFreq(); i > 0; i--) {
            if (obj.getGroupMap().containsKey(i)) {
                System.out.println("Frequency " + i + ": " + obj.getGroupMap().get(i));
            }
        }

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

        System.out.println("Stack elements by frequency after pops:");
        for (int i = obj.getMaxFreq(); i > 0; i--) {
            if (obj.getGroupMap().containsKey(i)) {
                System.out.println("Frequency " + i + ": " + obj.getGroupMap().get(i));
            }
        }
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */