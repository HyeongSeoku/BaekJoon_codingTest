/*
    문제 이름 : 회의실 배정
    문제 번호 : 1931
    문제 링크 : https://www.acmicpc.net/problem/1931
*/

const fs = require("fs");
const { start } = require("repl");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [n, ...arr] = input;
const roomObjs = [];
for (let obj of arr) {
  const tmp = obj.split(" ").map((i) => +i);
  roomObjs.push({ start: tmp[0], end: tmp[1] });
}

solution(Number(n), roomObjs);

function solution(n, list) {
  //리스트 정렬
  list.sort((a, b) => {
    if (a.end === b.end) {
      return a.start - b.start;
    } else {
      return a.end - b.end;
    }
  });
  //첫 회의실 배정
  let meetEnd = list[0].end;
  let cnt = 1;

  //이후 회의 비교
  for (let i = 1; i < n; i++) {
    //회의가 끝난 시간과보다 회의 시작 시간이 크거나 같으면
    if (meetEnd <= list[i].start) {
      meetEnd = list[i].end;
      cnt++;
    }
  }
  console.log(cnt);
}

//!! 문제 잘 읽기. "회의하는데 걸리는 시간" 이 아닌 "끝나는 시간"이 주어지는 것
