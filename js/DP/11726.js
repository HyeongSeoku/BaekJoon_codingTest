/*
    문제 이름 : 2×n 타일링
    문제 번호 : 11726
    문제 링크 : https://www.acmicpc.net/problem/11726
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress).toString());

solution(input);

function solution(num) {
  const DP = new Array(num + 1).fill(0);
  DP[1] = 1;
  DP[2] = 2;

  for (let i = 3; i <= num; i++) {
    DP[i] = (DP[i - 2] + DP[i - 1]) % 10007;
  }
  console.log(DP[num]);
}
