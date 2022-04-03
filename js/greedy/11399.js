/*
    문제 이름 : ATM
    문제 번호 : 11399
    문제 링크 : https://www.acmicpc.net/problem/11399
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [n, str] = input;
times = str.split(" ").map((i) => +i);
const answer = solution(times);

console.log(answer);

function solution(timeArr) {
  //값 할당 안해주면 undefined인 것 유의
  let answer = 0;

  timeArr.sort((a, b) => a - b);

  for (let i = 0; i < timeArr.length; i++) {
    answer += timeArr[i];
    for (let j = 0; j < i; j++) {
      answer += timeArr[j];
    }
  }
  return answer;
}
