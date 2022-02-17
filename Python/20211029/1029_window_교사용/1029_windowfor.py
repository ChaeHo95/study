from tkinter import *

#Tk( )는 기본이 되는 윈도우를 반환, 루트 윈도우(Root Window) 또는 베이스 윈도우(Base Window)라고 함
window = Tk()
#window2 = Tk()
#  윈도우 창에 제목 표시
window.title("윈도창 연습")
#window2.title("윈도창2 연습")
# 윈도우 창의 초기 크기 지정
window.geometry("800x600")
#window2.geometry("400x200")
# 윈도우 창의 크기 변경 가능 여부 설정, TRUE/FALSE or 1/0
window.resizable(width=1, height=FALSE)

# 2. 이미지 위젯 표시
# step1. 이미지 불러옴
filename = [None] * 10
imagelable = [None] * 10

for i in range(1,10,1):
    filename[i] = PhotoImage(file = "../gif/puz"+str(i)+".gif")
    imagelable[i] = Label(window, image=filename[i])
    imagelable[i].pack(side=LEFT)





#화면을 구성하고 처리
# 윈도우 창에 키보드 누르기, 마우스 클릭 등 다양한 이벤트를 처리
window.mainloop()
#window2.mainloop()
