
/**
 * @param {number} n
 * @return {Function} counter
 */
function createCounter(n) {
    let count = n;
    return function() {
        return count++;
    };
}

// Example usage:
const counter1 = createCounter(10);
console.log(counter1()); // 10
console.log(counter1()); // 11
console.log(counter1()); // 12

const counter2 = createCounter(-2);
console.log(counter2()); // -2
console.log(counter2()); // -1
console.log(counter2()); // 0
console.log(counter2()); // 1
console.log(counter2()); // 2
