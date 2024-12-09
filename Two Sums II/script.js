// O(n) time complexity
// O(1) space complexity

var twoSum = function(numbers, target) {
    let a=0, b = numbers.length-1;

    while(a<b){
        if(numbers[a] + numbers[b] > target){
            b--;
        }
        else if(numbers[a] + numbers[b] < target){
            a++;
        }else{
            return [a+1,b+1];
        }     
    }
    return [];

    ``` 2 ms, 50.2 MB
    const map = new Map();

    for(let i=0; i<numbers.length; i++){
        const complement = target - numbers[i];
        if(map.has(complement)){
            return [map.get(complement) + 1, i+1];
        }
        map.set(numbers[i],i);
    }
    return [];
    `

};