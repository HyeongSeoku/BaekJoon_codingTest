/*
    문제 이름 : 거스름돈
    문제 번호 : 5585
    문제 링크 : https://www.acmicpc.net/problem/5585
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress).toString());
const answer = solution(input);
console.log(answer);

function solution(price) {
  const coins = [500, 100, 50, 10, 5, 1];
  let count = 0;
  let exchangeMoney = 1000 - price;

  for (let i = 0; i < coins.length; i++) {
    let tmp = Math.floor(exchangeMoney / coins[i]);
    exchangeMoney -= tmp * coins[i];
    count += tmp;
  }
  return count;
}

//!!  오답 원인 : 5엔이 있는걸 빼먹음.
