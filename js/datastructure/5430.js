/*
    문제 이름 : AC
    문제 번호 : 5430
    문제 링크 : https://www.acmicpc.net/problem/5430
*/

/*
    R = 뒤집기
    D = 버리기
    첫줄 T = 테스트 케이스 개수
    두번째줄 수행할 함수
    다음줄 배열에 들어있는 수
    
 */

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

//spread 연산자
const [n, ...arr] = input;
const N = +n;

class Node {
  constructor(item) {
    this.item = item;
    this.prev = null;
    this.next = null;
  }
}

class Deque {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  size() {
    return this.length;
  }

  push_front(item) {
    const node = new Node(item);
    if (this.size() === 0) {
      this.head = node;
      this.tail = node;
    } else {
      this.head.prev = node;
      node.next = this.head;
      this.head = node;
    }
    this.length += 1;
  }
  push_back(item) {
    const node = new Node(item);
    if (this.size() === 0) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node;
      node.prev = this.tail;
      this.tail = node;
    }
  }

  pop_front() {
    if (this.size() === 0) return -1;
    const popItem = this.head;
    this.head = this.head.next;
    if (this.size() === 1) {
      this.head = null;
    } else {
      this.head.prev = null;
    }
    this.length -= 1;
    return popItem.item;
  }

  pop_back() {
    if (this.size() === 0) return -1;
    const popItem = this.tail;
    this.tail = this.tail.prev;
    if (this.size() === 1) {
      this.tail = null;
    } else {
      this.tail.next = null;
    }
    this.length -= 1;
    return popItem.item;
  }

  empty() {
    if (this.length === 0) return 1;
    else return 0;
  }

  front() {
    if (this.length === 0) return -1;
    return this.head.item;
  }

  back() {
    if (this.length === 0) return -1;
    return this.tail.item;
  }
}

let answer = [];

for (i = 0; i < N; i++) {
  let deq = new Deque();
  const command = arr.shift().split(""); //맨 앞 반환 후 split
  const arrLen = Number(arr.shift());

  const data = JSON.parse(arr.shift());
  let type = true; //true = 정방향 | false = 역방향
  data.forEach((element) => {
    deq.push_back(element);
    console.log("원소", element, deq);
  });
  let result;
  for (let i = 0; i < command.length; i++) {
    switch (command[i]) {
      case "R":
        type = !type;
        break;
      case "D":
        if (deq.empty()) {
          result = "error";
          break;
        } else {
          if (type) {
            deq.pop_front();
          } else {
            deq.pop_back();
          }
        }
        break;
    }
  }

  if (result === "error") {
    answer.push(result);
    continue;
  }
}
