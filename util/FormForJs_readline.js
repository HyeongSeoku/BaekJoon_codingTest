/*
    문제 이름 : 
    문제 번호 : 
    문제 링크 : 
*/

//한줄 입력
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  console.log(line);

  rl.close();
}).on("close", function () {
  process.exit();
});

//=====================================

//여러줄 입력
const readline = require("readline");

const rl2 = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl2
  .on("line", function (line) {
    input.push(line);
  })
  .on("close", function () {
    console.log(input);
    process.exit();
  });
