function pickingNumbers(a) {
    let maxCount = 0;
    for (let i = 0; i < a.length; i++) {
        let currentElement = a[i];
        let countGreater = 0;
        let countLesser = 0;
        for (let j = 0; j < a.length; j++) {
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


