/*
    문제 이름 : 스택
    문제 번호 : 10828
    문제 링크 : https://www.acmicpc.net/problem/10828
*/

const fs = require("fs");

// 백준 제출시 주석 제거
const readFileSyncAddress = "/dev/stdin";

// VScode 테스트시 주석 제거
//const readFileSyncAddress = "./example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

//구조 분해 할당
const [len, ...commands] = input;

const solution = (len, commands) => {
  const stack = [];

  let stack_point = 0;
  let answer = "";
  for (let i = 0; i < len; i++) {
    const command = commands[i].split(" ")[0];
    let result = 0;

    switch (command) {
      case "push":
        stack[stack_point++] = commands[i].split(" ")[1];
        break;
      case "pop":
        if (stack.length === 0) {
          result = -1;
        } else {
          result = stack.splice(-1);
          stack_point--;
        }
        answer += result + " ";
        break;
      case "size":
        result = stack.length;
        answer += result + " ";
        break;
      case "empty":
        stack.length === 0 ? (result = 1) : (result = 0);
        answer += result + " ";
        break;
      case "top":
        stack.length === 0 ? (result = -1) : (result = stack[stack.length - 1]);
        answer += result + " ";
        break;
      default:
        break;
    }
  }

  console.log(answer.split(" ").join("\n"));
};

solution(len, commands);
