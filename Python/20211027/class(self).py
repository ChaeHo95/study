# 클래스 정의 부분
class Car: 
    color = "" 
    speed = 0 

    def __init__(self): #기본 생성자 매개변수가 self만 있는 생성자
        self.color="빨강"
        self.speed=0
    
    def upSpeed(self,value):
        self.speed += value
        
    def downSpeed(self,value):
        self.speed -= value

# 메인코드 부분

myCar1=Car() 
myCar2=Car()
myCar3=Car()


print("자동차1의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar1.color,myCar1.speed))
print("자동차2의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar2.color,myCar2.speed))
print("자동차3의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar3.color,myCar3.speed))
