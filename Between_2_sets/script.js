function getTotalX(a, b) {
    const gcd = (x, y) => (!y ? x : gcd(y, x % y));
    const lcm = (x, y) => (x * y) / gcd(x, y);
    const lcm_a = a.reduce((acc, val) => lcm(acc, val), 1);
    const gcd_b = b.reduce((acc, val) => gcd(acc, val), b[0]);
    
    let count = 0;
    for (let i = lcm_a; i <= gcd_b; i += lcm_a) {
        if (gcd_b % i === 0) {
            count++;
        }
    }

    return count;
}


// Example usage:
const a = [2, 4];
const b = [16, 32, 96];
console.log(getTotalX(a, b));  // Output: 3

