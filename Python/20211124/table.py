from tkinter import *

score_left = 0
score_right = 0 

class Table:
    #constructor #constructor 생성자
    def __init__ (self, window, width, height, bg_color, net_color):
        self.width = width
        self.height = height
        self.bg_color = bg_color
        self.net_color = net_color
        
        #Create canvas inside table class
        self.canvas = Canvas(window, width=self.width, height = self.height, bg = self.bg_color)
        self.canvas.pack()
    
        self.canvas.create_line(0,0, self.width, self.height, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(self.width,0, 0, self.height, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(self.width/2,0, self.width, self.height, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(0,self.height, self.width/2, 0, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(self.width/2,self.height, self.width, 0, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(self.width/2,self.height, 0, 0, width=2, fill="black", dash=(15,23))

        self.canvas.create_line(self.width,0, self.width, self.height, width=2, fill="white", dash=(15,23))
        self.canvas.create_line(0,self.height, self.width, self.height, width=2, fill="white", dash=(15,23))
        self.canvas.create_line(4,4, self.width, 4, width=2, fill="white", dash=(15,23))
        self.canvas.create_line(4,0, 4, self.height, width=2, fill="white", dash=(15,23))

        self.canvas.create_oval(200,100,400,300,width=2, outline="black", dash=(15,23))
        
        self.canvas.create_oval(-100,100,100,300,width=2, outline="purple3", dash=(15,23))
        self.canvas.create_oval(500,100,700,300,width=2, outline="purple3", dash=(15,23))
        
        self.canvas.create_oval(-100,-100,100,100,width=2, outline="purple3", dash=(15,23))
        self.canvas.create_oval(-100,500,100,300,width=2, outline="purple3", dash=(15,23))
        self.canvas.create_oval(700,-100,500,100,width=2, outline="purple3", dash=(15,23))
        self.canvas.create_oval(700,500,500,300,width=2, outline="purple3", dash=(15,23))

        self.canvas.create_line(0,self.height/4, self.width, self.height/4, width=2, fill="lightgray", dash=(15,23))
        self.canvas.create_line(0,300, self.width, 300, width=2, fill="lightgray", dash=(15,23))
        self.canvas.create_line(200,0, 200, 400, width=2, fill="lightgray", dash=(15,23))
        self.canvas.create_line(400,0, 400, 400, width=2, fill="lightgray", dash=(15,23))
        self.canvas.create_line(100,0, 100, 400, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(500,0, 500, 400, width=2, fill="black", dash=(15,23))
        self.canvas.create_line(0,self.height/2, 600, self.height/2, width=2, fill="black", dash=(15,23))


        #Table 클래스 내에서 득점판 생성
        font = ("monaco", 70)
        self.scoreboard = self.canvas.create_text(self.width/2,50, font=font, fill = "violetred4",text=str(score_left)+" "+str(score_right))


    #function part
    # Function to add ellipse (ball) to Canvas(Table) #ellipse 타원형
    def draw_oval(self, oval):
        x1 = oval.x_posn
        x2 = oval.x_posn + oval.width
        y1 = oval.y_posn
        y2 = oval.y_posn + oval.height
        c = oval.color
        return self.canvas.create_oval(x1,y1,x2,y2,fill=c)

    # A function that adds a rectangle (bat) to a Canvas (Table) #rectangle 직사각형
    def draw_rectangle(self, rectangle):
        x1 = rectangle.x_posn
        x2 = rectangle.x_posn + rectangle.width
        y1 = rectangle.y_posn
        y2 = rectangle.y_posn + rectangle.height
        c = rectangle.color
        return self.canvas.create_rectangle(x1, y1, x2, y2, fill=c)


    #Use function coords() to manipulate items (balls and bats) on Canvas(Table) #manipulate 조작하
    #coords() is a function that updates the property value with the input value #property 속성 
    # Change the position of the ball and bat with the changed position value
    def move_item(self, item, x1, y1, x2, y2):
        self.canvas.coords(item, x1, y1, x2, y2)

    #Canvas(Table)에 득점판 갱신하는 함수
    def draw_score(self,left,right):
        score = str(left)+" "+str(right)
        self.canvas.itemconfigure(self.scoreboard, text=score)

   
