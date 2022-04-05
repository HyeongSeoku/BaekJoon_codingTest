/*
    문제 이름 : 로프
    문제 번호 : 2217
    문제 링크 : https://www.acmicpc.net/problem/2217
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs
  .readFileSync(readFileSyncAddress)
  .toString()
  .trim()
  .split("\n")
  .map((i) => +i);

const [n, ...ropes] = input;
ropes.sort((a, b) => a - b);
console.log(ropes);
solution(n, ropes);

function solution(n, list) {
  let maxW = 0;

  for (let i = 0; i < n; i++) {
    let tmpW = list[i] * (n - i);
    if (maxW < tmpW) {
      maxW = tmpW;
    }
  }
  console.log(maxW);
}

//!! 오답 원인 trim()을 안써줬더니 오류 발생
