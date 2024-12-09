


var maxArea = function(height) {
    let a=0, b=height.length -1 , max =0;
    while(a<b){
        const tol = Math.min(height[a],height[b]);
        const width = b-a;
        const area = width * tol;
        max = Math.max(area, max);
        if(height[a]<height[b]){
            a++;
        }else{
            b--;
        }
    }
    return max;
};

const height = [1,1] // [1,8,6,2,5,4,8,3,7];
console.log("result is :", maxArea(height));