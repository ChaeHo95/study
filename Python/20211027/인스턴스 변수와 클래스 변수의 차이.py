#인스턴스 변수 와 클래스 변수의 차이

# 클래스 선언
class Car:
    color = "" #필드 : 인스턴스 변수
    speed = 0 #필드 : 인스턴스 변수
    count = 0 #클래스 변수 #클래스 변수 count를 선언하고 0으로 초기화


    def __init__(self): #생성자
        self.speed = 0 #인스턴스 변수
        Car.count += 1 #클래스 변
        #생성자에서 클래스 변수에 접근하기 위해 클래스이름.count를 1 증가.

# 변수 선언
myCar1, myCar2 = None, None

#메인 코드 부분
myCar1 = Car() #인스턴스를 생성
#인스턴스를 생성할 때, 자동차의 총 생산대수를 1씩 증가
myCar1.speed = 30
print("자동차1의 현재속도는 %dkm, 생산된 자동차 숫자는 총 %d대입니다."%(myCar1.speed,Car.count))
myCar2 = Car() #인스턴스를 생성
myCar2.speed = 60
print("자동차2의 현재속도는 %dkm, 생산된 자동차 숫자는 총 %d대입니다."%(myCar2.speed,myCar2.count))
#메인 코드 부분에서 클래스 변수를 사용하기 위해서
#Car.count 또는 myCar2.count 모두 사용가능. 즉 둘 다 클래스 변수에 접근됨

