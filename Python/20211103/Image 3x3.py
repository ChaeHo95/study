from tkinter import *

window = Tk()
window.geometry("905x510")
#반복문과 리스트를 활용하여 소스코드 수정하기
#버튼을 이미지로 표현하기

#버튼에 사용될 이미지 생성하기

#번튼에 사용될 이미지 생성하
fnameList = ["gif/NAGATORO0.gif"]

for i in range(1,9):
    fnameList.append("gif/NAGATORO"+str(i+1)+".gif")
    
#Photoimage로 이미지 생성
photoList = [None]*9
for i in range(0,9):
    photoList[i] = PhotoImage(file = fnameList[i])

#버튼으로 이미지 출력    
button = [None]*9
xPos,yPos = 0,0

i = 0;
for y in range(0,3):
    for x in range(0,3):
        button[i] = Button(window, image = photoList[i])
        button[i].place(x = xPos,y = yPos)
        xPos += 300
        i += 1
    xPos = 0
    yPos += 168
