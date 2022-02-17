from tkinter import *
window = Tk()
window.geometry("800x600")

'''
# 버튼 생성
button1 = Button(window, text="버튼1")
button2 = Button(window, text="버튼2")
button3 = Button(window, text="버튼3")
button4 = Button(window, text="버튼4")
button5 = Button(window, text="버튼5")
button6 = Button(window, text="버튼6")

# 버튼 출력
button1.pack(side=LEFT)
button2.pack(side=LEFT)
button3.pack(side=LEFT)
button4.pack(side=LEFT)
button5.pack(side=LEFT)
button6.pack(side=LEFT)
'''


'''
# 반복문과 리스트를 활용하여 소스코드 수정하기
button = [None]*6
print(button)
for i in range(0,6):
    button[i] = Button(window, text="버튼"+str(i+1))
    button[i].pack(side=LEFT)
    print(button)
'''


'''
# 버튼 생성
button1 = Button(window, text="버튼1")
button2 = Button(window, text="버튼2")
button3 = Button(window, text="버튼3")
button4 = Button(window, text="버튼4")
button5 = Button(window, text="버튼5")
button6 = Button(window, text="버튼6")
button7 = Button(window, text="버튼7")
button8 = Button(window, text="버튼8")
button9 = Button(window, text="버튼9")
button10 = Button(window, text="버튼10")
button11 = Button(window, text="버튼11")
button12 = Button(window, text="버튼12")

# 버튼 출력
button1.place(x=0, y=0)
button2.place(x=50, y=0)
button3.place(x=100, y=0)

button4.place(x=0, y=30)
button5.place(x=50, y=30)
button6.place(x=100, y=30)

button7.place(x=0, y=60)
button8.place(x=50, y=60)
button9.place(x=100, y=60)

button10.place(x=0, y=90)
button11.place(x=50, y=90)
button12.place(x=100, y=90)
'''
'''
# 반복문과 리스트를 활용하여 소스코드 수정하기
button = [None]*12
xPos, yPos = 0,0

i=0
print(button)
for y in range(0,3):
    xPos= 0
    
    for x in range(0,4):
        button[i] = Button(window, text="버튼"+str(i+1))
        button[i].place(x=xPos, y=yPos)
        xPos += 50
        i+=1
    yPos+=30
'''

# 반복문과 리스트를 활용하여 소스코드 수정하기
# 버튼을 이미지로 표현하기

# 버튼에 사용될 이미지 생성하기

# 파일 이름 목록 리스트 생성
'''
fnameList=["gif/puz1.gif"]

for i in range(2,10):
    fnameList.append("gif/puz"+str(i)+".gif")
'''

#  PhotoImage로 이미지 생성
'''
photoList = [None] * 9

for i in range(0,9):
    photoList[i] = PhotoImage(file = "gif/puz"+str(i+1)+".gif")
'''
    
#  버튼으로 이미지 출력
photoList = [None] * 9
button = [None] * 9
xPos, yPos = 0,0
i=0

for y in range(0,3):
    xPos= 0    
    for x in range(0,3):
        #  PhotoImage로 이미지 생성
        photoList[i] = PhotoImage(file = "gif/puz"+str(i+1)+".gif")
        # 버튼 이미지 생성
        button[i] = Button(window, image=photoList[i])
        # 버튼 이미지 출력
        button[i].place(x=xPos, y=yPos)
        xPos += 70
        i+=1
    yPos+=70

    











window.mainloop()
