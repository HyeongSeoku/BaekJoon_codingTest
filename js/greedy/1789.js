/*
    문제 이름 : 수들의 합
    문제 번호 : 1789
    문제 링크 : https://www.acmicpc.net/problem/1789
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress).toString());
solution(input);

function solution(num) {
  let cnt = 0;
  let sum = 0;
  for (let i = 1; i <= 4294967295; i++) {
    sum += i;
    cnt++;
    if (sum > num) {
      cnt--;
      break;
    }
  }
  console.log(cnt);
}
