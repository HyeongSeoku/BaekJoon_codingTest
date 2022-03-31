/*
    문제 이름 : 최소,최대 2
    문제 번호 : 20053
    문제 링크 : https://www.acmicpc.net/problem/20053
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [t, ...arr] = input;

solution(t, arr);

function solution(t, arr) {
  for (let i = 0; i < t * 2; i += 2) {
    let n = arr[i];
    let tmpArr = arr[i + 1].split(" ").map((item) => +item);

    const maxN = Math.max(...tmpArr);
    const minN = Math.min(...tmpArr);
    console.log(minN, maxN);
  }
}
