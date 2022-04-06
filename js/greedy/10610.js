/*
    문제 이름 : 30
    문제 번호 : 10610
    문제 링크 : https://www.acmicpc.net/problem/10610
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().trim();

solution(input);

//reduce를 사용한 풀이
function solution(str) {
  let answer;
  if (!str.split("").includes("0")) {
    console.log(-1);
    return;
  }
  const splitArr = str.split("").map((i) => +i);
  const sumArr = splitArr.reduce((a, b) => a + b);

  //3의배수 = 각 자리의 숫자를 더한뒤 3으로 나눠지면 그 수는 3의 배수
  if (sumArr % 3 === 0) answer = splitArr.sort((a, b) => b - a).join("");
  else answer = -1;

  console.log(answer);
}

//for을 사용한 풀이
// function solution(str) {
//   let answer;
//   let sum = 0;
//   if (!str.split("").includes("0")) {
//     console.log(-1);
//     return;
//   }

//   for (let i = 0; i < str.length; i++) {
//     sum += parseInt(str[i]);
//   }
//   if (sum % 3 === 0) {
//     const splitArr = str.split("").map((i) => +i);
//     splitArr.sort((a, b) => b - a);
//     answer = splitArr.join("");
//   } else {
//     answer = -1;
//   }

//   console.log(answer);
// }
