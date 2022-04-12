/*
    문제 이름 : 과제 안내신 분..?
    문제 번호 : 5597
    문제 링크 : https://www.acmicpc.net/problem/5597
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs
  .readFileSync(readFileSyncAddress)
  .toString()
  .split("\n")
  .map((i) => +i);

solution(input);

function solution(input) {
  const classAll = [...Array(31).keys()].map((i) => i);
  let answer = [];

  classAll.shift();

  classAll.forEach((item) => {
    input.includes(item) ? "" : answer.push(item);
  });
  console.log(answer.join("\n"));
}
