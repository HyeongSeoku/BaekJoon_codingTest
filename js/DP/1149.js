/*
    문제 이름 : RGB거리
    문제 번호 : 1149
    문제 링크 : https://www.acmicpc.net/problem/1149
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
  .split("\n");

const [N, ...arr] = input;

console.log(arr);
let rgb = arr.map((i) => i.split(" ").map((item) => +item));

solution(+N, rgb);

function solution(n, list) {
  const DP = list;
  for (let i = 1; i < n; i++) {
    DP[i][0] += Math.min(DP[i - 1][1], DP[i - 1][2]);
    DP[i][1] += Math.min(DP[i - 1][0], DP[i - 1][2]);
    DP[i][2] += Math.min(DP[i - 1][0], DP[i - 1][1]);
  }
  console.log(Math.min(...DP[n - 1]));
}
