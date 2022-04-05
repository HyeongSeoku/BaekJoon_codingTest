/*
    문제 이름 : 전자 레인지     문제 번호 : 10162
    문제 링크 : https://www.acmicpc.net/problem/10162
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = parseInt(fs.readFileSync(readFileSyncAddress).toString());
solution(input);

function solution(time) {
  // a,b,c = 300초,60초,10초
  const buttons = [300, 60, 10];
  const answer = [0, 0, 0];
  for (let i = 0; i < buttons.length; i++) {
    let cnt = Math.floor(time / buttons[i]);
    time -= cnt * buttons[i];
    answer[i] = cnt;
    if (time === 0) break;
  }
  console.log(time !== 0 ? -1 : answer.join(" "));
}
