/*
    문제 이름 : 주유소
    문제 번호 : 13305
    문제 링크 : https://www.acmicpc.net/problem/13305
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

const [n, ...arr] = input;
const [distance, prices] = arr.map((i) =>
  i.split(" ").map((item) => BigInt(item))
);
//!! 오답 이유 BigInt 사용 안해서 부분 점수 받음.
solution(n, distance, prices);

function solution(n, distance, prices) {
  let curPrice = prices[0];
  let cost = 0n;
  for (let i = 0; i < n - 1; i++) {
    cost += curPrice * distance[i];
    if (curPrice > prices[i + 1]) curPrice = prices[i + 1];
  }

  console.log(String(cost));
}

// function solution(n, distance, prices) {
//   prices.pop();
//   let minPrice = Math.min(...prices);
//   let currentPrice = 10001;
//   let sumDistance = distance.reduce((a, b) => a + b);
//   let totalPrice = 0;

//   for (let i = 0; i < n; i++) {
//     if (prices[i] === minPrice) {
//       totalPrice += prices[i] * sumDistance;
//       break;
//     } else {
//       if (currentPrice > prices[i]) {
//         currentPrice = prices[i];
//       }
//       totalPrice += currentPrice * distance[i];
//       sumDistance -= distance[i];
//     }
//   }

//   console.log(totalPrice);
// }
