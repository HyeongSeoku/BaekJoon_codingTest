/*
    문제 이름 : 오리
    문제 번호 : 12933
    문제 링크 : https://www.acmicpc.net/problem/12933
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString();
const DUCK_SOUND = { q: 0, u: 1, a: 2, c: 3, k: 4 };

const answer = solution(input);
console.log("정답", answer);

function solution(duckSound) {
  const ducks = [];
  let answer;
  let duckCnt = 0;
  for (let i = 0; i < duckSound.length; i++) {
    if (duckSound[i] === "q") {
      ducks.push(DUCK_SOUND[duckSound[i]]);
      console.log("오리 배열", ducks);
      continue;
    }
    if (ducks.length !== 0) {
      for (let item = 0; item < ducks.length; item++) {
        if (ducks[item] + 1 === DUCK_SOUND[duckSound[i]]) {
          console.log("일치", ducks, item, duckSound[i], i);
          ducks[item] = DUCK_SOUND[duckSound[i]];
          if (ducks[item] === 4) {
            console.log("오리 카운트", duckCnt, ducks);
            ducks.splice(item, 1);
            duckCnt++;
          }
          break;
        }
      }
    } else {
      answer = -1;
    }
  }
  if (answer === -1) {
    return answer;
  } else {
    ducks.length === 0 ? (answer = duckCnt) : (answer = -1);
    return answer;
  }
}

// 미 해결
