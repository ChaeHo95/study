from tkinter import*
from tkinter import messagebox

#키보드나 마우스를 누르 것을 이벤트(Event)라함
#윈도우 프로그램의 mainloop()함수는  이벤트가 발생하면 처리함

#함수 정의 부분
#이벤트 처리 함수는 event매개변수(마우스와 키보드 관련 다양한 정보 포함)를 받음
def clickLeft(event):
    messagebox.showinfo("마우스","마우스 왼쪽 버튼이 클릭됨")
def clickRight(event):
    messagebox.showinfo("마우스","마우스 오른쪽 버튼이 클릭됨")
def clickImage(event):
    messagebox.showinfo("마우스","어딜 만져!")
def mouse(event):
    messagebox.showinfo("마우스","어디다가 올려?!!")

    
# 메인 코드 부분
window = Tk()

photo = PhotoImage(file="gif/NAGATORO1.gif")
label1 = Label(window,image=photo)

label1.bind("<Button>",clickImage)

window.bind("<Button-1>",clickLeft)  #마우스 왼쪽 버튼을 클릭했을때 이벤트 코드 : <Button-1>
window.bind("<Button-3>",clickRight)  #마우스 오른쪽 버튼을 클릭했을때 이벤트 코드 : <Button-3>
window.bind("<Enter>",mouse)  

label1.pack(expand=1, anchor=CENTER)
window.mainloop()
