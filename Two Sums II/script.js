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
};