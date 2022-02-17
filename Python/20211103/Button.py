from tkinter import *
window=Tk()

##w.geometry("800x600")
### 버튼 생성
##button1 = Button(window, text="버튼1")
##button2 = Button(window, text="버튼2")
##button3 = Button(window, text="버튼3")
###버튼 출력
##button1.pack(side = LEFT)
##button2.pack(side = LEFT)
##button3.pack(side = LEFT)
##


#반복문과 리스트를 활용하여 소스코드 수정하기
button = [None]*12

xPos, yPos = 0,0

i = 0
for y in range(0,3):
    for x in range(0,4):
        button[i] = Button(window, text="버튼"+str(i+1))
        button[i].place(x = xPos,y = yPos)
        xPos += 50
        i += 1
    xPos = 0
    yPos += 30

##while(i < 12):
##    button[i] = Button(window, text="버튼"+str(i+1))
##    button[i].place(x = xPos,y = yPos)
##    xPos += 50
##    i += 1
##    if(xPos == 200):
##        xPos = 0
##        yPos += 30
    
    
window.mainloop()
