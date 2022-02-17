import random,table


# Create Ball class

class Ball:
    #constructor
    def __init__(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn):
        self.width = width #the width size of the ball
        self.height = height#the height size of the ball
        self.x_posn = x_posn #the x-coordinate of the ball #coordinate 좌표
        self.y_posn = y_posn #the y-coordinate of the ball
        self.color = color

        self.x_start = x_posn
        self.y_start = y_posn
        self.x_speed = x_speed
        self.y_speed = y_speed

        self.table = table
        self.circle = self.table.draw_oval(self)
    # function part
    # The part where the ball moves.
        
    def move_next(self): # distance 거리 # current 현재의
        self.x_posn = self.x_posn + self.x_speed # add distance x to move to the current ball position
        self.y_posn = self.y_posn + self.y_speed # add distance y to move to the current ball position

        # 공이 위쪽 벽에 충돌했을 때:
        if(self.y_posn <= 0):
            self.y_posn = 0
            self.y_speed = -self.y_speed
        # 공이 아래쪽 벽에 충돌했을 때:
        if(self.y_posn >= (self.table.height - self.height)):
            self.y_posn = (self.table.height - self.height)
            self.y_speed = -self.y_speed
            
        # Finally, the movement of the circle #movement 움직임,(장소의) 이동
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.circle, x1, y1, x2, y2)
        

    #Specifies the initial position of the ball. # Specified 명시된 # initial 초기의
    def start_position(self):
        self.x_posn = self.x_start
        self.y_posn = self.y_start
        
    # The value of the global variable x_speed is called and assigned to the speed of the ball,
    # and the + or - speed value is applied by the randomly generated value.
    # assigned 할당된 #randomly 무작위로 # generate 발생시키다
    def start_ball(self, x_speed, y_speed):
        self.x_speed = -x_speed if random.randint(0,1) else x_speed
        self.y_speed = -y_speed if random.randint(0,1) else y_speed
        self.start_position()
        
    def stop_ball(self):
        self.x_speed = 0
        self.y_speed = 0    
