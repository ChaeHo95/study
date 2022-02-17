# 클래스 정의 부분
class Car: 
    color = "" 
    speed = 0 
    #배게변수를 입력받아 생성자 실행
    #생성자,인스턴스를 생성하면 무조건 호출되는 메소드
    def __init__(self, value1, value2): 
        self.color= value1
        self.speed= value2
    
    def upSpeed(self,value):
        self.speed += value
        
    def downSpeed(self,value):
        self.speed -= value

# 메인코드 부분
# 매게변수가 있는 생성자일 경우 클래스로부터 인스턴스 생성시 반드시
# 매게변수가 있는 생성자 활용
myCar1 = Car("빨강",30)
myCar2 = Car("파랑",60)
myCar3 = Car("노랑",0)

print("자동차1의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar1.color,myCar1.speed))
print("자동차2의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar2.color,myCar2.speed))
print("자동차3의 색상은 %s이며, 현재속드는 %d km 입니다."%(myCar3.color,myCar3.speed))
