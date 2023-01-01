/*
    문제 이름 : 부분합
    문제 번호 : 1806
    문제 링크 : https://www.acmicpc.net/problem/1806
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

const [N, S] = input[0].split(" ").map((item) => +item);
const arr = input[1].split(" ").map((item) => +item);

function solution(N, S, arr) {
  let answer = 0;
  let startIndex = 0;

  while (startIndex !== arr.length) {
    let curlength = 0;
    let sum = 0;
    for (let i = startIndex; i < arr.length; i++) {
      if (S <= sum) {
        if (answer > curlength || !answer) {
          answer = curlength;
        }
        break;
      }
      if (answer && curlength > answer) {
        break;
      }
      sum += arr[i];
      curlength += 1;
    }
    startIndex += 1;
  }

  console.log(answer);
}

solution(N, S, arr);
