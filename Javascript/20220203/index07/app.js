function Tester(serch, latitude, longitude) {
  this.serch = serch;
  this.latitude = latitude;
  this.longitude = longitude;
}
Tester.prototype.how_far = function (origin, destination) {
  const lat1 = origin.latitude;
  const lon1 = origin.longitude;

  const lat2 = destination.latitude;
  const lon2 = destination.longitude;

  const R = 6371e3; // 지구의 반지름 (meter)

  // 좌표를 라디안 단위로 변환

  const φ1 = (lat1 * Math.PI) / 180;
  const φ2 = (lat2 * Math.PI) / 180;
  const Δφ = ((lat2 - lat1) * Math.PI) / 180;
  const Δλ = ((lon2 - lon1) * Math.PI) / 180;
  const a =
    Math.sin(Δφ / 2) * Math.sin(Δφ / 2) +
    Math.cos(φ1) * Math.cos(φ2) * Math.sin(Δλ / 2) * Math.sin(Δλ / 2);
  const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  const d = R * c; // meter

  return d / 1000;
};

const seoul = new Tester("서울역", 37.55620110026294, 126.97223116703012);
const daejeon = new Tester("대전역", 36.332516127741, 127.43421099777726);
const deagu = new Tester("동대구역", 35.88049128950934, 128.62837657353532);
const busan = new Tester("부산역", 35.116613680508806, 129.04009077373016);

const citys = [seoul, daejeon, deagu, busan];

console.log(citys);

const prices = {};

let index_num = 0;
citys.forEach((element) => {
  for (let index in citys) {
    if (element == citys[index]) {
      index_num = index;
      break;
    }
  }
  for (let i = index_num; i < citys.length; i++) {
    if (element.serch != citys[i].serch) {
      const km = Math.floor(element.how_far(element, citys[i]));
      const price = 100 * km;
      prices[`${element.serch} - ${citys[i].serch}`] = price;
    }
  }
});
console.table(prices);
