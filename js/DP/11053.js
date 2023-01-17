/*
    문제 이름 : 가장 긴 증가하는 부분 수열
    문제 번호 : 11053
    문제 링크 : https://www.acmicpc.net/problem/11053
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const n = Number(input[0]);
const numbers = input[1].split(" ").map((i) => +i);

solution(n, numbers);

function solution(n, list) {
  const dp = new Array(n).fill(1);
  console.log(list);

  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (list[j] < list[i]) {
        dp[i] = Math.max(dp[j] + 1, dp[i]);
        // console.log("i:", i, "j:", j, "dp[i]:", dp[i], "dp[j]:", dp[j]);
      }
    }
  }
  console.log(dp);

  console.log(Math.max(...dp));
}
