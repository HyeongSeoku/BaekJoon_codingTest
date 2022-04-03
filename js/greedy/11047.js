/*
    문제 이름 : 동전 0
    문제 번호 : 11047
    문제 링크 : https://www.acmicpc.net/problem/11047
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

const [nStr, ...priceStr] = input;
const [n, k] = nStr.split(" ").map((i) => +i);
const priceArr = priceStr.map((i) => +i);

const result = solution(k, priceArr);
console.log(result);

function solution(total, priceArr) {
  priceArr.sort((a, b) => b - a);
  let cnt = 0;
  for (let i of priceArr) {
    if (total === 0) break;
    //오답 원인 : 초과일 경우만 적어주었음
    if (total >= i) {
      cnt += parseInt(total / i);
      total = total % i;
    }
  }
  return cnt;
}
