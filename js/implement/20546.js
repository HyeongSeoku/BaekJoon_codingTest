/*
    문제 이름 : 기적의 매매법
    문제 번호 : 20546
    문제 링크 : https://www.acmicpc.net/problem/20546
*/

const fs = require("fs");

// 백준 제출시 주석 제거
// const readFileSyncAddress = "/dev/stdin"

// VScode 테스트시 주석 제거
const readFileSyncAddress = "example.txt";

const input = fs.readFileSync(readFileSyncAddress).toString().split("\n");

const [money, command] = input;
const machineDuck = command.split(" ").map((i) => +i);

solution(money, machineDuck);

function solution(money, machinDuck) {
  let increaseCounter = 0;
  let decreaseCounter = 0;
  let bnpHave = 0;
  let timingHave = 0;
  let bnpMoney = money;
  let timingMoney = money;

  machinDuck.map((stock, idx) => {
    purchaseAble(bnpMoney, stock)
      ? ([bnpMoney, bnpHave] = purchaseStock(bnpMoney, stock, bnpHave))
      : "";

    //증가 감소 판별
    idx === 0
      ? ""
      : ([decreaseCounter, increaseCounter] = decreaseIncreasedDetermination(
          decreaseCounter,
          increaseCounter,
          machinDuck[idx - 1],
          stock
        ));

    if (increaseCounter === 3) {
      //판매 가능한 타이밍
      if (timingHave !== 0) {
        timingMoney = timingHave * stock;
        timingHave = 0;
        return;
      }
    } else if (decreaseCounter === 3) {
      purchaseAble(timingMoney, stock)
        ? ([timingMoney, timingHave] = purchaseStock(
            timingMoney,
            stock,
            timingHave
          ))
        : "";
    } else "";
  });

  const lastStock = machinDuck[machinDuck.length - 1];
  const lastBnp = lastStock * bnpHave + bnpMoney;
  const lastTiming = lastStock * timingHave + timingMoney;
  if (lastBnp > lastTiming) {
    console.log("BNP");
    return;
  }
  if (lastBnp < lastTiming) {
    console.log("TIMING");
    return;
  } else {
    console.log("SAMESAME");
  }
}

function purchaseAble(money, currentPrice) {
  if (money >= currentPrice) return true;
  else return false;
}

function purchaseStock(money, currentPrice, stockHave) {
  let extraMoney;
  if (money >= currentPrice) {
    //구매 가능한 경우
    stockHave += parseInt(money / currentPrice);
    extraMoney = money % currentPrice;
  }
  return [extraMoney, stockHave];
}

function decreaseIncreasedDetermination(
  decreaseCounter,
  increaseCounter,
  prevPrice,
  currentPrice
) {
  if (prevPrice < currentPrice) {
    //상승일때
    if (increaseCounter === 3) {
      increaseCounter;
      decreaseCounter = 0;
    } else {
      increaseCounter++;
      decreaseCounter = 0;
    }
  } else if (prevPrice > currentPrice) {
    //하락일때
    if (decreaseCounter === 3) {
      decreaseCounter;
      increaseCounter = 0;
    } else {
      decreaseCounter++;
      increaseCounter = 0;
    }
  } else "";

  return [decreaseCounter, increaseCounter];
}
