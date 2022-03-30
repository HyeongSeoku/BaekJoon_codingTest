/*
    문제 이름 : 8진수 2진수
    문제 번호 : 1212
    문제 링크 : https://www.acmicpc.net/problem/1212
*/

const fs = require("fs");

// 백준 제출시 주석 제거
//const readFileSyncAddress = "/dev/stdin";

// VScode 테스트시 주석 제거
const readFileSyncAddress = "./example.txt";

//공백제거 필수 오답 원인
const input = fs.readFileSync(readFileSyncAddress).toString().trim();

const result = solution(input);
console.log(result);

function solution(octal) {
  const number = octal.split("");

  let answer = "";

  number.forEach((str, idx) => {
    const dex = parseInt(str, 8);
    let binary = dex.toString(2);
    if (idx !== 0) binary = binary.padStart(3, 0);
    answer += binary;
  });
  return answer;
}

//==============================================
//첫번째 풀이
// function solution(octal){
//     const binary = parseInt(octal,8).toString(2)
//     console.log(binary);
// }

//==============================================
//다른 풀이

// const fs = require('fs');
// let N = fs.readFileSync("./dev/stdin").toString().trim().split('');
// let answer = '';

// const bin ={
//   '0':'000',
//   '1':'001',
//   '2':'010',
//   '3':'011',
//   '4':'100',
//   '5':'101',
//   '6':'110',
//   '7':'111',
// }
// const first = {
//   '0':'0',
//   '1':'1',
//   '2':'10',
//   '3':'11',
//   '4':'100',
//   '5':'101',
//   '6':'110',
//   '7':'111',
// }

// while(N.length>1){
//   answer = bin[N.pop()]+answer
// }

// console.log(first[N.pop()]+answer)
