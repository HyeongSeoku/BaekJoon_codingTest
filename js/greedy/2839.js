/*
    문제 이름 : 설탕 배달
    문제 번호 : 2839
    문제 링크 : https://www.acmicpc.net/problem/2839
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress));

const answer = solution(input);
console.log(answer);
//3,5킬로그램

function solution(n) {
  let answer;
  let cnt = 0;
  while (true) {
    if (n % 5 === 0) {
      answer = cnt + n / 5;
      break;
    }
    if (n < 0) {
      answer = -1;
      break;
    }
    cnt++;
    n -= 3;
  }
  return answer;
}
