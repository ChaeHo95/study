# MyPong의 주된 파일을 만듭니다.

from tkinter import *
import table, ball, bat,random

window = Tk()
window.title("MyBreakout")
my_table = table.Table(window)

# 전역 변수 초기화
x_velocity = 4
y_velocity = 10
first_serve = True
count = 0
# Ball 모듈에서 Ball클래스 My_ball 인스턴스 생성
my_ball = ball.Ball(table = my_table, x_speed=x_velocity,y_speed=y_velocity,width=24, height=24, color="red", x_start=288, y_start=700)

# Bat 공장으로부터 배트를 주문합니다
bat_B = bat.Bat(table = my_table, width=100, height=10, x_posn=250, y_posn=750, color="blue")

# Bat 클래스로부터 배트를 주문하지만 이것은 벽돌을 호출하는 것은 아닙니다.
bricks = []
def wall():
    global bricks,count
    count = 0
    for b in bricks:
        my_table.remove_item(b.rectangle)
        bricks.remove(b)
    b=1
    x_posn = 30
    y_posn = 75
    for i in range(10):
        for k in range(8):
            R = random.randint(0,255)
            G = random.randint(0,255)
            B = random.randint(0,255)
            bricks.append(bat.Bat(table = my_table, width=50, height=20,x_posn= x_posn, y_posn=y_posn, color="#{:02x}{:02x}{:02x}".format(R,G,B)))
            b = b+1
            x_posn += 70
            count += 1
        x_posn = 30
        y_posn += 45

        
#### 함수:
def game_flow():
    global first_serve,bricks,count
    # 첫번째 서브를 기다립니다:

    if(first_serve==True):
        my_ball.stop_ball()
        first_serve = False
    
    # 배트에 공이 충돌하는지 감지
    bat_B.detect_collision(my_ball, sides_sweet_spot=False,topnbottom_sweet_spot=True)

    # 벽돌에 공이 충돌하는지 감지
    for b in bricks:
        #  b번째 공이 벽돌에 충돌했다면 벽돌을 화면에서 지우고, 배열에서 삭제
        if(b.detect_collision(my_ball, sides_sweet_spot=False) != None):
            print(b.detect_collision(my_ball, sides_sweet_spot=False))
            my_table.remove_item(b.rectangle)
            bricks.remove(b)
            count -= 1
            my_table.draw_score(count)
            for i in bricks:
                G = random.randint(0,255)
                B = random.randint(0,255)
                R = random.randint(0,255)
                my_table.change_item_colour(i.rectangle,"#{:02x}{:02x}{:02x}".format(R,G,B))
                my_table.change_item_colour(my_ball.circle,"#{:02x}{:02x}{:02x}".format(random.randint(0,255),random.randint(0,255),random.randint(0,255)))
                my_table.change_item_colour(bat_B.rectangle,"#{:02x}{:02x}{:02x}".format(random.randint(0,255),random.randint(0,255),random.randint(0,255)))
                my_table.chage_canvas_colour("#{:02x}{:02x}{:02x}".format(random.randint(0,255),random.randint(0,255),random.randint(0,255)))

        # 벽돌이 없다면 점수 출력
        if(len(bricks) == 0):
            my_ball.stop_ball()
            my_ball.start_position()
            my_table.draw_score("그럭저럭하는군")         
            
    # 아래쪽 벽에 공이 충돌하는지 감지
    if(my_ball.y_posn >= my_table.height - my_ball.height):
        my_ball.stop_ball() 
        my_ball.start_position()
        first_serve = True
        my_table.draw_score("이것도 못하니?")
    my_ball.move_next()
    window.after(30, game_flow)
    
def restart_game(master):
    wall()
    my_ball.start_ball(x_speed=x_velocity, y_speed=y_velocity)
    bat_B.start_position()
    my_table.draw_score(count)


# 배트를 제어할 수 있도록 키보드의 키와 연결
window.bind("<Left>", bat_B.move_left)
window.bind("<Right>", bat_B.move_right)

# 스페이스 키를 게임 재시작 기능과 연결
window.bind("<space>", restart_game)
game_flow()
wall()
window.mainloop()

