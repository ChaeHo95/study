from tkinter import *

window = Tk()
window.geometry("905x510")

photoList = [None]*10
fnameList = [""]
    
button = [None]*10
xPos,yPos =0,0
for i in range(1,10):
    fnameList.append("gif/NAGATORO"+str(i)+".gif")
    photoList[i] = PhotoImage(file = fnameList[i])
    button[i] = Button(window, image = photoList[i])
    button[i].place(x = xPos,y = yPos)
    xPos += 300
    if(xPos == 900): 
        xPos = 0
        yPos += 168
