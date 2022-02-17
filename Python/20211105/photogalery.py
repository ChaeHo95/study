from tkinter import*
from time import*

#변수 선언 부분
fnameList=["NAGATORO1.gif", "NAGATORO2.gif",  "NAGATORO3.gif",  "NAGATORO4.gif",
           "NAGATORO5.gif","NAGATORO6.gif", "NAGATORO7.gif", "NAGATORO8.gif",
           "NAGATORO9.gif", ]

num = 0 # 리스트의 인덱스 값을 저장하는 변수

#함수 선언 부분
#[다음] 버튼을 클릭하면 실행되는 함수
def clickNext():
    global num #전역변수 num을 함수내에서 사용하겠다는 선언
    num += 1 #다음 사진을 보여야 하므로 사진 번호를 하나 증가시킴
    if num > 8: # 사진 번호가 최대 8이므러 8이 넘으면 0번 사진을 보여줌
        num = 0
    # 변경된 사진 번호에 해당하는 이미지 파일로 pLabel
    photo = PhotoImage(file = "gif/"+fnameList[num])
    pLabel.configure(image=photo)
    pLabel.image=photo
#[이전]버튼을 클릭하면 실행되는 함수
def clickPrev():
    global num #전역 변수 num을 함수내에서 사용하겠다는 선언
    num -= 1 #이전 사진을 보여야 하므로 사진 번호를 하나 증가 시킴
    if num < 0:# 사진번호가 최소 0이므로 0이 넘으면 다이 8번 사진을 보여줌
        num = 8
# 변경된 사진 번호가 해당하는 이미지 파일로 pLabel을 변셩
    photo = PhotoImage(file = "gif/"+fnameList[num])
    pLabel.configure(image=photo)
    pLabel.image=photo
#pageUp 키를 누르면 실행되는 함수
#[다음]버튼을 누르는 것과 동일한 기능을 하므로 clickNext()함수를 호출
def pageUp(event):
    clickNext()
#pageDown 키를 누르면 실행되는 함수
#[이전]버튼을 누르는 것과 동일한 기능을 하므로 clickPrev()함수를 호출
def pageDown(event):
    clickPrev()

#메인 코드 부분
window = Tk()
window.geometry("700x500")
window.title("사진 앨범 보기")

window.bind("<Prior>",pageUp)
window.bind("<Right>",pageUp)
window.bind("<Next>",pageDown)
window.bind("<Left>",pageUp)

#버튼 위젯 생성
btnPrev = Button(window, text = "<<이전", command = clickPrev)
btnNext = Button(window, text = "다음>>", command = clickNext)

#이미지를 파일로부터 준비
photo = PhotoImage(file = "gif/"+fnameList[0])
#이미지 위젯 생성
pLabel = Label(window, image=photo)

# 버튼 위젯 디스플레이
btnPrev.place(x=250,y=10)
btnNext.place(x=400,y=10)
pLabel.place(x=15,y=50)

window,mainloop()
