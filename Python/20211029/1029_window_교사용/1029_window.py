# tkinter는 파이썬에서 GUI 관련 모듈을 제공해주는 표준 윈도우 라이브러리
# 위젯(Widget) - 윈도우 창에 나올 수 있는 문자, 버튼, 체크박스, 라디오버튼 등을 말함
# 파이썬 3.6 이후 버전에서 messagebox.showinfo()  함수를 사용하기 위해서는
# 아래 코드를 추가해야 오류 발생하지 않음
from tkinter import *
from tkinter import messagebox

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

# 1. 라벨은 문자 또는 이미지를 표현할 수 있는 위젯
# 위젯은 생성하고 디스플레이하는 2스텝으로 진행
# step1. 라벨 위젯을 생성
label1 = Label(window, text="Python은 재미있다.^^")
label2 = Label(window, text="Python은 재미있다.너무 재미있다.^^")
label3 = Label(window, text="오늘은 불금", font=("궁서체", 30), fg="blue")
# anchor는 위젯의 위치 지정,  N, NE, E, SE, S, SW, W, NW, CENTER 등이며 기본값은  CENTER
label4 = Label(window, text="0", bg="magenta", width=20, height=10, anchor=NW, font=("궁서체", 10))
# step2. 라벨 위젯을 화면에 표시
# pack()함수를 호출하여 화면에 디스플레이 됨
label1.pack()
label2.pack()
label3.pack()
label4.pack()

# 2. 이미지 위젯 표시
# step1. 이미지 불러옴
filename = PhotoImage(file = "../gif/dog.gif")
filename2 = PhotoImage(file = "../gif/dog4.gif")
filename3 = PhotoImage(file = "../gif/jeju2.gif")

# step2. 라벨 위젯을 생성
imagelable3 = Label(window, image=filename3)
imagelable = Label(window, image=filename)
imagelable2 = Label(window, image=filename2)

# step3. 라벨 위젯을 화면에 표시
imagelable3.place(x=-2, y=-2)
imagelable.place(x=100, y=100)
imagelable2.place(x=200, y=200)

# 버튼을 눌렀을 때 사용자 정의 함수가 실행되도록 하기
# 사용자 정의 함수 만들기
def myFunc():
    messagebox.showinfo("강아지 버튼", "강아지 이쁘다.^^")

# 3. 버튼  위젯 표시
# step1. 버튼 위젯을 생성
#button1 = Button(window,text="파이썬 종료", fg="red", command=quit) # 버튼에 텍스트 표시
button1 = Button(window,image=filename, fg="red", command=myFunc) # 메시지박스 실행
# step2. 버튼 위젯을 화면에 표시
button1.pack()

#화면을 구성하고 처리
# 윈도우 창에 키보드 누르기, 마우스 클릭 등 다양한 이벤트를 처리
window.mainloop()
#window2.mainloop()











