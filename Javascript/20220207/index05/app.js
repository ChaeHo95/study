function Music(){
    this.name = '보고 싶다'
    this.artist = '김범수'
    this.release = '2002-12-17'

    const music = {
        name: '금요일에 만나요',
        artist: 'IU',
        release: '2013-12-20',
        info: () => {
            console.log(this)
            console.log(`${this.name} - ${this.artist} 는 ${this.release} 에 발매되었다.`)
        }
    }
    return music
}

const music = new Music()
music.info()

// Music 생성자 함수로 music 객체를 생성하고 info 메서드를 호출
// info 메서드는 화살표 함수로 정의
//  info 메서드 내부의 this 를 출력해보면 아래와 같이 생성자 함수(Music)를 가리킴