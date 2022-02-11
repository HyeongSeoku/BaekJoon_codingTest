const input = require("fs").readFileSync("dev/stdin").toString().split(" ");
let num1 = parseInt(input[0]);
let num2 = parseInt(input[1]);

if (num1 === num2) {
  console.log("==");
  return;
}

console.log(num1 < num2 ? "<" : ">");
