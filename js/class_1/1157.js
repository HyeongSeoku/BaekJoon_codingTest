const input = require("fs").readFileSync("dev/stdin").toString().toLowerCase();
const result = new Array(26).fill(0);

for (let i = 0; i < input.length; i++) {
  result[input.charCodeAt(i) - 97]++;
}

const maxResult = Math.max(...result);
const maxIndex = result.indexOf(maxResult);
let sameCnt = 0;

result.map((item) => (item === maxResult ? sameCnt++ : ""));

console.log(sameCnt === 1 ? String.fromCharCode(maxIndex + 65) : "?");
