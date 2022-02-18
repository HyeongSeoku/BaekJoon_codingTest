/*
    문제 이름 : 요세푸스 문제
    문제 번호 : 1158
    문제 링크 : https://www.acmicpc.net/problem/1158
*/

const input = require("fs").readFileSync("dev/stdin").toString().split(" ");

const N = parseInt(input[0]);
const K = parseInt(input[1]);

const circle = [...Array(N + 1).keys()];
circle.shift(); //0 제거
const result = Array();

let cnt = 1;
while (circle.length) {
  if (K === cnt) {
    result.push(circle.shift());
    cnt = 1;
  } else {
    circle.push(circle.shift());
    cnt++;
  }
}

console.log(`<${result.join(", ")}>`);
