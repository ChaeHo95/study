from tkinter import *

window = Tk()
window.geometry("800x600")

# 2. 이미지 위젯 표시
'''
filename1 = PhotoImage(file = "../gif/puz1.gif")
imagelable1 = Label(window, image=filename1)
imagelable1.pack(side=LEFT)

filename2 = PhotoImage(file = "../gif/puz2.gif")
imagelable2 = Label(window, image=filename2)
imagelable2.pack(side=LEFT)

filename3 = PhotoImage(file = "../gif/puz3.gif")
imagelable3 = Label(window, image=filename3)
imagelable3.pack(side=LEFT)
'''
# 반복문과 리스트를 결합하여 이미지 위젯을 순서대로 표시하기 
# 리스트 선언
filename = [None] * 10
imagelable  = [None] * 10

for i in range(1,10,1):
    filename[i] = PhotoImage(file = "../gif/puz"+str(i)+".gif")
    imagelable[i] = Label(window, image=filename[i])
    imagelable[i].pack(side=LEFT)

window.mainloop()















