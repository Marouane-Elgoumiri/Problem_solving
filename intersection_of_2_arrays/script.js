// Return the intersection elements of 2 arrays
// array1=[4,1,7,4,7]
// array2=[4,2,7,5]

//  output=[4,7]

var intersection = function (array1, array2) {
    let firstSet = new Set();

    for (let num of array1) {
        firstSet.add(num);
    }
    let intersectionSet = new Set();
    for (let num of array2) {
        if (firstSet.has(num)) {
            intersectionSet.add(num);
        }
    }
    return Array.from(intersectionSet);
}