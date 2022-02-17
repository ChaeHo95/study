from tkinter import *
# Import module to call randint function.
from table import *
from ball import *
from bat import *

# Initialize global variables # Initialize 초기화를 하다 # variable 변수
x_speed =12 # x speed of the ball
y_speed = 0 # y speed of the ball

score_left = 0
score_right = 0 
        
# game_flow() function part
def game_flow():
    global score_right, score_left
    # Move the ball at regular intervals # regular 규칙적인 # at (....)interval (...의 시간적) 간격을 두고
    my_ball.move_next()
    window.after(30, game_flow) # Execute the game_flow() function every 30 milliseconds,ex).500 for 5 seconds

    # 공이 배트에 닿았는지 충돌 확인:
    bat_L.detect_collision(my_ball)
    bat_R.detect_collision(my_ball)

    # 공이 좌우 벽에 충돌했을 때 처리
    # 공의 X 좌표값이 0보다 작을 경우 왼쪽 벽에 충돌한 상황
    if(my_ball.x_posn <= 0) :
        my_ball.stop_ball() # 공을 멈춤, x_speed, y_speed를 0으로 설정
        my_ball.start_position() # 공의 위치 초기화
        bat_L.start_position() # bat_L 배트 위치 초기화 
        bat_R.start_position() # bat_R 배트 위치 초기화
        my_table.move_item(bat_L.rectangle, 20, 150, 35, 250) # bat_L 배트를 초기 위치로 이동
        my_table.move_item(bat_R.rectangle, 565, 150, 580, 250) # bat_R 배트를 초기 위치로 이

        # 득점판 득점 표시
        score_left = score_left + 1
        if(score_left >= 3):  # 왼쪽 득점 3 이상일 경우 왼쪽 글자 W(Win) 표시
            score_left = "W"
            score_right = "L"
        my_table.draw_score(score_left,score_right)
        
    # 공이 오른쪽 벽에 충돌했는지 감지하여 처리
    if(my_ball.x_posn + my_ball.width >= my_table.width):
        my_ball.stop_ball() # 공을 멈춤, x_speed, y_speed를 0으로 설정
        my_ball.start_position() # 공의 위치 초기화
        bat_L.start_position() # bat_L 배트 위치 초기화
        bat_R.start_position() # bat_R 배트 위치 초기화
        my_table.move_item(bat_L.rectangle, 20, 150, 35, 250)
        my_table.move_item(bat_R.rectangle, 565, 150, 580, 250)   

        # 득점판 득점 표시
        score_right = score_right + 1
        if(score_right >= 3):
            score_right = "W"
            score_left = "L"          
        my_table.draw_score(score_left,score_right)
   

# restart_game() function part
# Function to restart the game
def restart_game(master):
    global score_left
    global score_right
    if(score_right == "W" and score_left == "L"or score_right == "L" and score_left == "W"):
        score_right = 0
        score_left = 0       
        my_table.draw_score(score_left,score_right)
    
    my_ball.start_ball(x_speed=x_speed, y_speed=y_speed)
    bat_L.start_position() # bat_L 배트 위치 초기화
    bat_R.start_position() # bat_R 배트 위치 초기화
    my_table.move_item(bat_L.rectangle, 20, 150, 35, 250)
    my_table.move_item(bat_R.rectangle, 565, 150, 580, 250)      

    
#Main
window = Tk()
window.title("MyPingPong")

 
# Creating a table using the Table class
my_table = Table(window, 600, 400,"maroon","red3")

# Create Ball
my_ball = Ball(table=my_table, x_speed=0, y_speed=0, width=24, height=24,color="plum4", x_posn=288, y_posn=188)

# Create Bat
# Order a bat from the Bat class # Order 명령하다, (상품을) 주문하다.
bat_L = Bat(table=my_table, width=15, height=100, x_posn=20, y_posn=150, color="brown4")
bat_R = Bat(table=my_table, width=15, height=100, x_posn=565, y_posn=150, color="orangered4")

# Execution part of the function

#Execution part of game_flow() function
game_flow() 

# Execution part of restart_game() function
# Press the spacebar to start or restart the game. #press 누르다
window.bind("<space>",restart_game)

#Specify the key event to control the bat and the function to be connected to  #Specify 명시하다 #connected 관련이 있는 
#window.bind("<key name>", function name)
window.bind("<w>",bat_L.move_up)
window.bind("<s>",bat_L.move_down)

window.bind("<Up>",bat_R.move_up)
window.bind("<Down>",bat_R.move_down)

window.mainloop()
