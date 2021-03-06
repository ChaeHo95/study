# 라디오버튼은 여러개 중 하나를 선택하기 위해 사용되는 위젯
from tkinter import *
window = Tk()
window.geometry("400x400")

# 함수 정의 부분
# 위젯명.configure(옵션=값)은 해당 위젯의 옵션 값을 변경해주는 함수
# var 변수의 값에 따라 윈도우 하단 라벨의 텍스트를 변경
def  myFunc() :
    if var.get() == 1 :
        label1.configure(text="파이썬을 선택하셨습니다.")
    elif var.get() == 2 :
        label1.configure(text="C++을 선택하셨습니다.")
    else :
        label1.configure(text="Java을 선택하셨습니다.")
    
# 메인 코드 부분
# IntVar()는 정수형 형식의 변수를 생성하는 함수
var = IntVar()
# 3개의 라디오 버튼 준비
#rb1 버튼을 선택하면 var의 값으로 1이 대입됨
rb1 = Radiobutton(window, text="파이썬", variable=var, value = 1, command=myFunc)
#rb2 버튼을 선택하면 var의 값으로 2가 대입됨
rb2 = Radiobutton(window, text="C++", variable=var, value = 2, command=myFunc)
#rb3 버튼을 선택하면 var의 값으로 3이 대입됨
rb3 = Radiobutton(window, text="Java", variable=var, value = 3, command=myFunc)

label1 = Label(window, text="선택한 언어 : ", fg="red")

rb1.pack()
rb2.pack()
rb3.pack()
label1.pack()

window.mainloop()
