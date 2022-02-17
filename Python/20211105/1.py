from tkinter import*
from time import*

#변수 선언 부분
fnameList = []
nameList = ["소녀","토개피","꺼부기","파라섹트","고라파덕","우추동","식스테일","푸크린","얼굴"]
for i in range(0,9):
    fnameList.append("NAGATORO"+str(i+1)+".gif")
    
num = 0

#함수 선언 부분
def clickNext():
    global num
    num += 1
    if num > 8:
        num = 0

    photo = PhotoImage(file = "gif/"+fnameList[num])
    tLabel.configure(text = nameList[num])
    pLabel.configure(image=photo)
    pLabel.image=photo

def clickPrev():
    global num
    num -= 1
    if num < 0:
        num = 8

    photo = PhotoImage(file = "gif/"+fnameList[num])
    tLabel.configure(text = nameList[num])
    pLabel.configure(image=photo)
    pLabel.image=photo

def pageUp(event):
    clickNext()

def pageDown(event):
    clickPrev()

#메인 코드 부분
window = Tk()
window.geometry("700x575")
window.resizable(width=False,height=False)
window.configure(background="black")
background_img = PhotoImage(file = "./gif/background.gif")
imagelabelbackground_img = Label(window,image = background_img)
imagelabelbackground_img.place(x= -2, y=-2)




window.title("사진 앨범 보기")

window.bind("<Prior>",pageUp)
window.bind("<Right>",pageUp)
window.bind("<Next>",pageDown)
window.bind("<Left>",pageUp)


photonext = PhotoImage(file = "gif/1.gif")
photoprev = PhotoImage(file = "gif/2.gif")
btnPrev = Button(window, image = photonext, command = clickPrev, bd =0, background = "black")
btnNext = Button(window, image = photoprev, command = clickNext, bd =0, background = "black") 

photo = PhotoImage(file = "gif/"+fnameList[0])
pLabel = Label(window, image=photo,bd =0)
tLabel = Label(window, text = nameList[0])


btnPrev.pack(side = LEFT)
btnNext.pack(side = RIGHT)
pLabel.place(x =295, y =12)
tLabel.place(x=295,y=545)


window,mainloop()
