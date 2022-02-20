/*
    문제 이름 : 카드 놓기
    문제 번호 : 18115
    문제 링크 : https://www.acmicpc.net/problem/18115
*/

const fs = require("fs");

// 백준 제출시 주석 제거
//const readFileSyncAddress = "/dev/stdin";

// VScode 테스트시 주석 제거
const readFileSyncAddress = "./example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const N = parseInt(input[0]);
const skillArr = input[1].split(" ");
skillArr.reverse();

const resultArr = [...Array(N).keys()].map((i) => i + 1);
const answer = [];

for (let i = 0; i < N; i++) {
  let skill = parseInt(skillArr[i]);
  switch (skill) {
    case 1:
      answer.unshift(resultArr[i]);
      break;
    case 2:
      answer.splice(1, 0, resultArr[i]);
      break;
    case 3:
      answer.push(resultArr[i]);
      break;
  }
}

console.log(answer);
