/*
    문제 이름 : 계단 오르기
    문제 번호 : 2579
    문제 링크 : https://www.acmicpc.net/problem/2579
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs
  .readFileSync(readFileSyncAddress)
  .toString()
  .split("\n")
  .map((i) => +i);

const [n, ...arr] = input;

solution(n, arr);

function solution(n, stairs) {
  const DP = new Array(n).fill(0);
  DP[0] = stairs[0];
  DP[1] = stairs[0] + stairs[1];
  DP[2] = Math.max(stairs[1] + stairs[2], stairs[0] + stairs[2]);

  for (let i = 3; i < n; i++) {
    DP[i] = Math.max(
      stairs[i] + stairs[i - 1] + DP[i - 3],
      stairs[i] + DP[i - 2]
    );
  }

  console.log(DP[n - 1]);
}
