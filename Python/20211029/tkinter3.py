#라디오버튼은 여러개 중 하나를 선택하기 위해 사용되는 위젯
from tkinter import*
window = Tk()
window.geometry("400x400")

#함수 정의 부분
#위젯명.configure(옵션=값)은 해당 위젯의 옵션 값을 변경해주는 함수
def myFunc():
    if var.get()==1:
        label1.configure(text="파이썬을 선택하셨습니다.")
    elif var.get()== 2:
        label1.configure(text="C++을 선택하셨습니다.")
    else :
        label1.configure(text="JAVA을 선택하셨습니다.")

#위젯명

#메인 코드 부분

var = IntVar()
rb1 = Radiobutton(window,text="파이썬",variable=var,value=1,command=myFunc)

rb2 = Radiobutton(window,text="C++",variable=var,value=2,command=myFunc)

rb3 = Radiobutton(window,text="JAVA",variable=var,value=3,command=myFunc)

label1 = Label(window, text = "선택한 언어: ", fg="red")

rb1.pack()
rb2.pack()
rb3.pack()
label1.pack()

window.mainloop()
