##   메소드 오버라이딩(Overriding)
#   상위 클래스의 메소드를 하위 클래스에서 재정의하는 것.
#   다음의 그림에서 트럭은 속도에 제한이 없지만,
#   승용차는 안전상 속도가 최대 150km로 제한되어야 한다고 가정함.
#   슈퍼 클래스(자동차)를 상속받은 서브 클래스(승용차, 트럭)는
#   속도 올리기( ) 메소드를 상속받았지만, 승용차의 경우 속도의
#   제한이 필요해서 자동차의 속도 올리기( )와 내용이 달라야
#   하므로 승용차 클래스에서 속도 올리기( )를 다시 만들어서 사용함.

#클래스 선언
class Car :
    speed = 0
    def upSpeed(self, value):
        self.speed += value

        print("현재 속도(슈퍼 클래스) : %d" %self.speed)


class Sedan(Car):
    def upSpeed(self, value):
        self.speed+=value

        if self.speed > 150:
            self.speed = 150

        print("현재 속도(서브 클래스) : %d" %self.speed)


class Truck(Car):
    pass

#변수 선언
sedan1, truck1, = None, None

#메인 코드 부분
truck1=Truck()
sedan1=Sedan()

print("트럭 >>", end="")
truck1.upSpeed(200)

print("승용차 >>", end="")
sedan1.upSpeed(200)
