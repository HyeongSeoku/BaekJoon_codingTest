/*
    문제 이름 : 신입 사원
    문제 번호 : 1946
    문제 링크 : https://www.acmicpc.net/problem/1946
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [testCase, ...arr] = input;
let cnt = 0; //인원수 파악 변수
let list = [];
for (let i = 0; i < testCase; i++) {
  list = [];
  let n = parseInt(arr[cnt]);
  cnt += 1;
  for (let j = cnt; j < cnt + n; j++) {
    list.push(arr[j]);
  }
  cnt += n;
  solution(n, list);
}

function solution(n, list) {
  //서류 높은 순으로 정렬
  let tmpArr = list
    .map((item) => item.split(" ").map((i) => +i))
    .sort((a, b) => a[0] - b[0]);
  let topApplicant = tmpArr[0][1]; //서류 1등의 면접 점수
  let enteredCnt = 1;

  for (let i = 1; i < tmpArr.length; i++) {
    if (topApplicant > tmpArr[i][1]) {
      // 오답의 원인. 기준을 안바꿔줬기 때문에 틀렸음
      topApplicant = tmpArr[i][1];
      enteredCnt++;
    }
  }
  console.log(enteredCnt);
}
