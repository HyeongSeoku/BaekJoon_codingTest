/*
    문제 이름 : 잃어버린 괄호
    문제 번호 : 1541
    문제 링크 : https://www.acmicpc.net/problem/1541
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";
//split(/\+|\-/);"
const input = fs.readFileSync(readFileSyncAddress).toString();
let list = input.split("-");
solution(list);

function solution(list) {
  let tmp = [];

  for (i of list) {
    let cnt = 0;
    let s = i.split("+"); //+로 분리후 cnt에 값을 더한후 tmp에 삽입
    console.log(s);
    for (j of s) {
      cnt += parseInt(j);
    }
    tmp.push(cnt);
  }

  let result = tmp[0]; //연산된 결과값에 - 를 붙여 계산
  for (let j = 1; j < tmp.length; j++) {
    result -= tmp[j];
  }
  console.log(result);
}
