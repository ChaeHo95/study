from tkinter import *
from tkinter import messagebox

# 키보드나 마우스를 누르는 것을 이벤트(Event)라 함
# 윈도우 프로그램의 mainloop() 함수는 이벤트가 발생하면 처리함

# 함수 정의 부분
# 이벤트 처리 함수는 event매개변수(마우스와 키보드 관련 다양한 정보 포함)를 받음
def clickLeft(event) :
    messagebox.showinfo("마우스", "왼쪽 마우스가 클릭됨")

def clickRight(event) :
    messagebox.showinfo("마우스", "오른쪽 마우스가 클릭됨")

def clickImage(event) :
    #messagebox.showinfo("마우스", "퍼즐에 마우스를 올렸음")
    window2 = Tk()

# 메인 코드 부분
window = Tk()
window.geometry("500x500")

photo = PhotoImage(file="gif/puz1.gif")
label1 = Label(window, image=photo)

label1.bind("<Enter>",clickImage)

window.bind("<Button-1>", clickLeft) # 마우스 왼쪽 버튼을 클릭했을 때 이벤트 코드 : <Button-1>
window.bind("<Button-3>", clickRight) # 마우스 왼쪽 버튼을 클릭했을 때 이벤트 코드 : <Button-3>

label1.pack( expand=1, anchor=CENTER)
window.mainloop()
