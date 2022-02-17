from tkinter import *

#함수 정의 부분
def clickMouse(event):
    txt = ""
    if event.num == 1:
        txt += "마우스 왼쪽 버튼이 ("
    elif event.num == 3:
        txt += "마우스 오른쪽 버튼이 ("

    txt += str(event.y)+","+str(event.x)+")에서 클릭됨"
    #tkinter에는 위젯들의 text 속성을 변경할 수 있도록 해주는 configure() 함수
    label1.configure(text=txt)
    label1.place_configure(x=event.x , y=event.y)

window = Tk()

window.geometry("400x400")

label1 = Label(window, text="이곳이 바뀜")

window.bind("<Button>",clickMouse)

label1.place(x =0 ,y=0)

window.mainloop()
