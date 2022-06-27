/*
    문제 이름 : 평범한 배낭
    문제 번호 : 12865
    문제 링크 : https://www.acmicpc.net/problem/12865
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

//구조 분해 할당
const [[N, K], ...INVENTORY] = input.map((item) =>
  item.split(" ").map((str) => +str)
);

function solution() {
  const DP = Array(K + 1).fill(0);
  console.log(INVENTORY);

  INVENTORY.forEach(([w, v]) => {
    for (let i = K; i >= w; i -= 1) {
      DP[i] = Math.max(DP[i], DP[i - w] + v);
    }
  });

  console.log(DP[K]);
}

solution();
