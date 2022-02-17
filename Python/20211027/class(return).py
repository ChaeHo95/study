# 클래스 정의 부분
class Car: 
    color = "" 
    speed = 0 
    #배게변수를 입력받아 생성자 실행

    def __init__(self, name, speed): 
        self.name= name
        self.speed= speed
    
    def getName(self):
        return self.name
        
    def getSpeed(self):
        return self.speed

#변수 선언
car1, car2, car3 = None, None, None

# 메인코드 부분

myCar1 = Car("빨강",30)
myCar2 = Car("파랑",60)
myCar3 = Car("노랑",0)

print("자동차1의 브랜드는 %s이며, 현재속드는 %d km 입니다."%(myCar1.getName(),myCar1.getSpeed() ))
print("자동차2의 브랜드는 %s이며, 현재속드는 %d km 입니다."%(myCar2.getName(),myCar2.getSpeed() ))
print("자동차3의 브랜드는 %s이며, 현재속드는 %d km 입니다."%(myCar3.getName(),myCar3.getSpeed() ))
