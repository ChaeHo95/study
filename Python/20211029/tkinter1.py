from tkinter import*

window = Tk()
window.geometry("800x600")


#2.이미지 위젯 표시

##filename1 = Photoimage(file = "./gif/puz[1].gif")
##imagelabel1 = Label(window, image=filename1)
##imagelabel1.pack(side = LEFT)
##
##filename2 = Photoimage(file = "./gif/puz[2].gif")
##imagelabel2 = Label(window, image=filename1)
##imagelabel2.pack(side = LEFT)
##
##filename3 = Photoimage(file = "./gif/puz[3].gif")
##imagelabel3 = Label(window, image=filename1)
##imagelabel3.pack(side = LEFT)

# 반복문과 리스트를 결합하여 이미지 위젯을 순서대로 표시하기
# 빈리스트 선언

filename = [None]*10
imagelabel = [None]*10

for i in range(1,10,1):
    filename[i] = PhotoImage(file = "./gif/puz"+str(i)+".gif")
    imagelabel[i] = Label(window, image=filename[i])
    imagelabel[i].pack(side = LEFT)

window.mainloop()
