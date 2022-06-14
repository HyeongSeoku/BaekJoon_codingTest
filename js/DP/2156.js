/*
    문제 이름 : 포도주 시식
    문제 번호 : 2156
    문제 링크 : https://www.acmicpc.net/problem/2156
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [n, ...wine] = input.map((item) => +item);
solution(n, wine);

function solution(n, wine) {
  const dp = new Array(n).fill(0);
  dp[1] = wine[0];
  dp[2] = wine[0] + wine[1];

  for (let i = 3; i <= n; i++) {
    dp[i] = Math.max(
      dp[i - 3] + wine[i - 2] + wine[i - 1],
      dp[i - 2] + wine[i - 1],
      dp[i - 1]
    );
  }
  console.log(dp[n]);
}
