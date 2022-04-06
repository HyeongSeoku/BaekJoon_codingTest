/*
    문제 이름 : 거스름돈
    문제 번호 : 14916
    문제 링크 : https://www.acmicpc.net/problem/14916
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress).toString());

solution(input);

function solution(price) {
  let cnt = 0;
  while (price !== 0 && price > 0) {
    if (price % 5 === 0) {
      cnt += Math.floor(price / 5);
      price = price % 5;
    } else {
      price -= 2;
      cnt++;
    }
  }
  if (price !== 0) {
    cnt = -1;
  }
  console.log(cnt);
}
