//백준에 업로드할시 readFileSync("/dev/stdin")
const input = require("fs").readFileSync("/dev/stdin").toString().split(" ");
const a = parseInt(input[0]);
const b = parseInt(input[1]);
console.log(a - b);
