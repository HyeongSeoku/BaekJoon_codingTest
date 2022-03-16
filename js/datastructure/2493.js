/*
    문제 이름 : 탑
    문제 번호 : 2493
    문제 링크 : https://www.acmicpc.net/problem/2493
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

//spread 연산자
const [n, commands] = input;

const solution = (n, text) => {
  const towerList = text.split(" ").map(Number);
  n = +n; //숫자 변환
  let stack = [];
  let answer = Array(n).fill(0);
  for (let i = n - 1; i >= 0; i--) {
    while (stack.length && towerList[i] > towerList[stack[stack.length - 1]]) {
      answer[stack.pop()] = i + 1;
    }
    stack.push(i);
  }
  return answer.join(" ");
};

const answer = solution(n, commands);
console.log(answer);
