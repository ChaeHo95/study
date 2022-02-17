const userName = document.getElementById("user-name"); // 사용자 이름 입력창
const userEmail = document.getElementById("user-email"); // 사용자 연락처 입력창
const userAge = document.getElementById("user-age"); // 사용자 나이 입력창
const userList = document.getElementById("user-list"); // 사용자 리스트 출력 위치

const submitBtn = document.getElementById("user-add"); //  사용자 추가 버튼
const users = []; // 사용자 리스트 배열

// 입력창 유효성 검증
function isValid(str) {
  return str !== "" && str !== undefined;
}

// user 정보로부터 user 에 대한 DOM 객체 생성 및 반환
function buildElement(user) {
  const userEl = document.createElement("div");
  userEl.className = 'user'
  userEl.innerHTML = `name : ${user.name}<br>age : ${user.age}<br>email : ${user.email}`
  return userEl;
}
// users 배열을 이용하여 화면에 사용자 리스트 보여주기
function displayUsers(users) {
    userList.innerHTML = ''
    users.map(user => {
      userList.appendChild(buildElement(user))
    })
}

// 입력창 초기화
function initInput() {
  userName.value = "";
  userEmail.value = "";
  userAge.value = "";
}

// 사용자 추가하기
function addUser() {
  const list = {name: userName.value, age: userAge.value, email: userEmail.value};
  if (isValid(list.name) && isValid(list.age) && isValid(list.email)) {
    users.push(list);
    displayUsers(users)
    console.log(users)
    initInput()
  }
  else{
      alert('입력을 올바른게 해주세요.')
      initInput()
  }
}

submitBtn.addEventListener("click", addUser);
