from tkinter import *
from tkinter import messagebox
window = Tk()

#함수 정의 부분
#chk.get()함수로 체크버튼에 설정된 값 가져와 메시지 출력
def myFunc():
    if chk.get() == 0:
        messagebox.showinfo("","체크버튼이 꺼졌어요.")
    else :
        messagebox.showinfo("","체크버튼이 켜졌어요.")


#메인 코드 부분
#intVar()는 정수형 형식의 변수를 생성하는 함수
chk=IntVar()
cb1=Checkbutton(window, text ="클릭하세요",variable=chk,command=myFunc)
#체크 박스을 켜면 chk에 1이, 끄면 chk에 0이 대입됨

#체크버튼에 cb1이표시됨
cb1.pack()

window.mainloop()
