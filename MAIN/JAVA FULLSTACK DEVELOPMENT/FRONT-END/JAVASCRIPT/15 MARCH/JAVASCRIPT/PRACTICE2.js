let string = prompt("Enter the string:");

const reg = /[aeiou]/gi;

let vowels = string.match(reg);

let count = vowels.length;

document.write(`string is ${string} <br>`);

document.write(`vowels count is ${count}`);