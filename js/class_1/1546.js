/*
    문제 이름 : 평균
    문제 번호 : 1546
    문제 링크 : https://www.acmicpc.net/problem/1546
*/

const input = require("fs").readFileSync("dev/stdin").toString().split("\n");

const N = parseInt(input[0]);
const grade = input[1].split(" ");
const maxGrade = Math.max(...grade);
let sum = 0;

grade.map((item) => {
  sum += (item / maxGrade) * 100;
});

console.log(sum / N);
