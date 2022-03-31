/*
    문제 이름 : 달팽이
    문제 번호 : 1913
    문제 링크 : https://www.acmicpc.net/problem/1913
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs
  .readFileSync(readFileSyncAddress)
  .toString()
  .split("\n")
  .map((i) => +i);

const [n, num] = input;
const snail = create2DArray(n, n);
//정답
const sy = Math.floor(n / 2);
const sx = Math.floor(n / 2);
snail[sy][sx] = 1;
let y = sy;
let x = sx;
let move = 1;
let digit = 1;
let round = 0;
const dy = [-1, 0, 1, 0]; // 시계 방향
const dx = [0, 1, 0, -1];
let fy = sy;
let fx = sx;
while (digit < n * n) {
  for (let i = 0; i < move && digit < n * n; i++) {
    y += dy[round % 4];
    x += dx[round % 4];
    digit++;
    snail[y][x] = digit;
    if (digit === num) {
      fy = y;
      fx = x;
    }
  }
  if (round % 2 === 1) move++;
  round++;
}
// for (let i = 0; i < n; i++) {
//   console.log(snail[i].join(" "));
// }
console.log(snail.join("\n").replaceAll(",", " "));

console.log(fy + 1, fx + 1);

function create2DArray(rows, columns) {
  let arr = new Array(rows);
  for (let i = 0; i < rows; i++) {
    arr[i] = new Array(columns).fill(0);
  }

  return arr;
}

//오답
// solution(N, table, num);

// function solution(n, table, number) {
//   let resultX, resultY;

//   const centerLocation = parseInt(n / 2);
//   let turnDoneFlag = false;
//   let currentX;
//   let currentY;

//   const dx = [-1, 0, 1, 0];
//   const dy = [0, 1, 0, -1];
//   let directionVector;
//   let turnCount = 0;
//   let tmpArr = table;

//   for (let i = 1; i <= n * n; i++) {
//     if (i === 1) {
//       currentX = centerLocation;
//       currentY = centerLocation;

//       tmpArr[currentX][currentY] = i;
//       turnCount++;
//       directionVector = 0;
//       continue;
//     }
//     if (i === 2) {
//       currentX += dx[directionVector];
//       currentY += dy[directionVector];

//       tmpArr[currentX][currentY] = i;
//       directionVector++;
//       continue;
//     }

//     currentX += dx[directionVector];
//     currentY += dy[directionVector];

//     tmpArr[currentX][currentY] = i;

//     //좌표 값 저장
//     if (i === number) {
//       resultX = currentX + 1;
//       resultY = currentY + 1;
//     }

//     if (isConer(currentX, currentY, centerLocation, turnCount)) {
//       if (directionVector === 3) {
//         directionVector = 0;
//         turnDoneFlag = false;
//       } else {
//         directionVector++;
//         turnDoneFlag = false;
//       }
//       continue;
//     } else if (turnIsDone(currentX, currentY, centerLocation, turnCount)) {
//       turnDoneFlag = true;
//       turnCount++;
//     } else if (turnDoneFlag) {
//       directionVector++;
//       turnDoneFlag = false;
//     } else {
//       //정상적인 경우
//     }
//   }

//   const resultArr = tmpArr.join("\n").replaceAll(",", " ");
//   console.log(resultArr);
//   console.log(resultX, resultY);
// }

// function isConer(curX, curY, center, count) {
//   //오른쪽위
//   const rightUpConer = curX == center + count && curY == center - count;
//   //오른쪽 아래
//   const rightDownConer = curX == center + count && curY == center + count;
//   //왼쪽 아래
//   const leftDownConer = curX == center - count && curY == center + count;

//   if (rightUpConer | rightDownConer | leftDownConer) return true;
//   else return false;
// }

// function turnIsDone(curX, curY, center, count) {
//   //왼쪽 위일때(한 사이클이 끝났을때.)
//   const leftUpConer = curX == center - count && curY == center - count;
//   if (leftUpConer) return true;
//   else return false;
// }

// function isNewTurn(curX, curY, center, count) {
//   const startingPoint = curX == center - count + 1 && curY == center - count;
//   if (startingPoint) return true;
//   else return false;
// }

// function create2DArray(rows, columns) {
//   let arr = new Array(rows);
//   for (let i = 0; i < rows; i++) {
//     arr[i] = new Array(columns).fill(0);
//   }

//   return arr;
// }
