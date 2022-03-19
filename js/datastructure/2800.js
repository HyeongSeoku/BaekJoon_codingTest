/*
    문제 이름 : 괄호 제거
    문제 번호 : 2800
    문제 링크 : https://www.acmicpc.net/problem/2800
*/

const fs = require("fs");

// 백준 제출시 주석 제거
//const readFileSyncAddress = "/dev/stdin";

// VScode 테스트시 주석 제거
const readFileSyncAddress = "./example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString();
const stack = [];
let list = [];
let answer = [];

for (let i = 0; i < input.length; i++) {
  if (input[i] === "(") {
    stack.push(i);
  } else if (input[i] === ")") {
    list.push([stack.pop(), i]);
  }
}

dfs(input.split(""));
answer = answer
  .filter((el) => el !== input)
  .sort()
  .reduce((a, c) => a + c + "\n", "")
  .trim();
// console.log(answer);

function dfs(arr, count = 0) {
  console.log("호출될때마다 카운트:", count);
  if (count === list.length) {
    let str = arr.join("");
    if (!answer.includes(str)) answer.push(str);
    return;
  }
  //"( 또는 ) 뺴줄때마다 count 하나씩 더해줌"
  // 모든 쌍을 제거했을 때 answer에 push
  dfs(arr.slice(), count + 1);
  arr = arr.slice();
  arr[list[count][0]] = "";
  arr[list[count][1]] = "";
  dfs(arr, count + 1);
}
