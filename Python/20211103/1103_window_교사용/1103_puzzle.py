from tkinter import *
window = Tk()
window.geometry("800x600")

# 파일 이름 목록 리스트 생성
'''
fnameList=["gif/puz1.gif"]

for i in range(2,10):
    fnameList.append("gif/puz"+str(i)+".gif")
    print(fnameList)
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
        photoList[i] = PhotoImage(file = "gif/puz"+str(i+1)+".gif")
        button[i] = Button(window, image=photoList[i])
        button[i].place(x=xPos, y=yPos)
        xPos += 70
        i+=1
    yPos+=70

window.mainloop()
