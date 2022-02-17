function findMaxValue(...args) {
  // 구현하기
  console.log(args);

  let max = 0;
  for (let arg of args) {
    if (typeof arg === "string") {
        arg = parseFloat(arg);
      }
    if (typeof arg !== "number") {
      arg = null;
    }
    if (arg > max) {
      max = arg;
    }
  }
  return max;
}
// 테스트 케이스
console.log(findMaxValue(-3, 7, -345, 41, 9, 137, 69));
console.log(findMaxValue(-31, 8, null, -26, false, 92, {}, 284, 923, [], "2045.8", 'zip', 54, "1024"))