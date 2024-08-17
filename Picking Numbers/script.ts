function pickingNumbers(a: number[]): number {
    let maxCount: number = 0;  
    for (let i: number = 0; i < a.length; i++) { 
        let currentElement: number = a[i];  
        let countGreater: number = 0;  
        let countLesser: number = 0; 
        for (let j: number = 0; j < a.length; j++) {  
            if (a[j] === currentElement || a[j] === currentElement + 1) {
                countGreater++;
            }
            if (a[j] === currentElement || a[j] === currentElement - 1) {
                countLesser++;
            }
        }
        maxCount = Math.max(maxCount, countGreater, countLesser);
    }
    return maxCount;  
}
