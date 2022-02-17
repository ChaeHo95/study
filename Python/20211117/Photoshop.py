from tkinter import *
from tkinter.filedialog import *
from tkinter.simpledialog import *
from wand.image import *
import time
from pathlib import Path
window,canvas,paper = None, None, None
photo,photo2 = None,None 
oriX,oriY,newX, newY=0,0,0,0

def displayImage(img,width,height):
    global window,canvas,paper,photo,photo2,oriX,oriY,newX, newY
    

    if canvas != None :
        canvas.destroy()

    canvas = Canvas(window, width=width, height=height,bg='black',bd=0, highlightthickness=0)

    paper=PhotoImage(width=width, height=height)

    blob= img.make_blob(format='png')
    paper.put(blob)

    canvas.create_image((width/2,height/2),image=paper,state="normal")

    canvas.place(x=(935-width)/2, y=(950-height)/2)
    
    photo1, window1, pLabel = (None,)*3
def trap():
    global photo1,window1, pLabel, photo2, pLabel1
    window2 = Toplevel()
    window2.geometry("1000x750")
    photo2 = PhotoImage(file = "gif/trap.gif")
    pLabel1 = Label(window2, image=photo2)
    pLabel1.place(x=-2,y=-2)
    trap1()
    window2.mainloop()
    
def trap1():
    sec = 10
    print(sec)
    while (sec != 0 ):
        sec = sec-1
        time.sleep(1)
        print(sec)
        
def exitt():
    window.quit()
    window.destroy()
    window1.quit()
    window1.destroy()
    
def func_exit():
    global photo1, window1, pLabel
    window1 = Toplevel()
    window1.geometry("225x225")
    window1.resizable(width=False, height=False)
    window1.title("종료??")
    photo1 = PhotoImage(file = "gif/exit.gif")
    photo2 = PhotoImage(file = "gif/exit1.gif")
    pLabel = Label(window1, image=photo1)
    btn1 = Button(window1, text = "종료", command = trap)
    btn2 = Button(window1, image = photo2, command = exitt,bg ="white", bd =0)
    tLabel = Label(window1, text = "정말 저기 있는게 \n 종료 버튼일까?",bg="white")
    
    pLabel.place(x=-2,y=-2)
    btn1.place(x=100, y=190)
    btn2.place(x = -2, y = 50)
    tLabel.place(x=60, y=20)
    window1.mainloop()

def func_reset(): 
    
    global window,canvas,paper,photo,photo2,oriX,oriY,newX, newY

    photo2 = photo.clone()
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2,newX,newY)
    
    
def func_open():
    
    global window,canvas,paper,photo,photo2,oriX,oriY,newX, newY, photo_Label
    readFp = askopenfilename(parent=window,filetypes=(
        ("모든 그림 파일", "*.jpg;*.jpeg;*.bmp;*.png;*.tif;*.gif"),  ("모든 파일", "*.*") ))

    photo = Image(filename=readFp)
    oriX = photo.width 
    oriY = photo.height

    photo2 = photo.clone()
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2,newX,newY)

    photo_Label = Label(window, text=Path(readFp).stem, fg="white", bg="black",font=("Courier", 16, "italic"))
    photo_Label.place(x=-2, y=99)
    
    fileMenu.entryconfig("파일 저장", state = "normal")
    fileMenu.entryconfig("리셋", state = "normal")
    mainMenu.entryconfig("이미지 처리(1)", state = "normal")
    mainMenu.entryconfig("이미지 처리(2)",state = "normal")
    fileMenu.entryconfig("이미지 삭제",state = "normal")
    
        
def func_save():
    global window,canvas, paper, photo, photo2, oriX, oriY

    if photo2 == None :
        return

    saveFp = asksaveasfile(parent=window, mode="w", defaultextension=".jpg",
                           filetypes=(("JPG 파일", "*.jpg;*.jpeg"),  ("모든 파일", "*.*") ))
    savePhoto = photo2.convert("jpg") 
    savePhoto.save(filename=saveFp.name)


#확대
def func_zoomin():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY
    
    if photo2 == None :
        return

    scale = askinteger("확대배수", "확대할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize( int(oriX * scale) , int(oriY * scale) )
    newX = photo2.width 
    newY = photo2.height    
    displayImage(photo2, newX, newY)
    
#축소
def func_zoomout():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY
    
    if photo2 == None :
        return
    scale = askinteger("확대배수", "확대할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize( int(oriX / scale) , int(oriY /scale) )
    newX = photo2.width 
    newY = photo2.height    
    displayImage(photo2, newX, newY)


# Wand 라이브러리에서 제공하는 flip()함수 와 flop()함수를 사용
#상하반전, flip()
def func_mirror1():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    
    photo2.flip()
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

#좌우 반전,flop()함수
def func_mirror2():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    
    photo2.flop()
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)
def func_rotate():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    
    degree = askinteger("회전", "회전할 각도를 입력하세요", minvalue=0, maxvalue=360)
    photo2.rotate(degree)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

#밝게 modulate(밝기값,100,100)함수에 100~200 값 입력
def func_bright():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = askinteger("밝게","값을 입력하세요(100~200)",minvalue=100,maxvalue=200)
    photo2.modulate(value,100,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

# 어둡게, modulate(밝기값,100,100)함수에 100~200 값 입력
def func_dark():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = askinteger("어둡게","값을 입력하세요(0~100)",minvalue=0,maxvalue=100)
    photo2.modulate(value,100,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

#선명하게, modulate(100,채도값,100)함수에 100~200 값 입력
def func_clear():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = askinteger("선명하게","값을 입력하세요(100~200)",minvalue=100,maxvalue=200)
    photo2.modulate(100,value,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)
#탁하게, modulate(100,채도값,100)함수에 0~100 값 입력
def func_unclear():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = askinteger("탁하게","값을 입력하세요(0~100)",minvalue=0,maxvalue=100)
    photo2.modulate(100,value,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)
    
#이미지 처리2  > 흑백이미지
#이미지의 type 값을 "grayscale"로 설정
def func_bw():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY
    if photo2 == None :
        return
    photo2.type="grayscale"
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

def canvas_close():
    global photo_Label
    photo_Label.destroy()
    canvas.quit()
    canvas.destroy()
    


def clickLeft(event):
    global textLabel    
    textLabel["text"] = askstring("입력창 ","입력하고 싶은 글 적으세요.")

def func_brightt():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = 100
    photo2.modulate(value+10,100,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_darkk():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY

    if photo2 == None :
        return
    value = 100
    photo2.modulate(value-10,100,100)
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_zoominn():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY
    
    if photo2 == None :
        return

    scale =1
    photo2.resize( int(oriX * 1.15) , int(oriY * 1.15) )
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_zoomoutt():
    global window,canvas, paper, photo, photo2, oriX, oriY,newX, newY
    
    if photo2 == None :
        return
    
    scale = 1
    photo2.resize( int(oriX / 1.15) , int(oriY / 1.15) )
    newX = photo2.width 
    newY = photo2.height
    displayImage(photo2, newX, newY)

    

#메인코드 부분
window = Tk()
window.geometry("1200x900")
window.title("미니 포토샵(ver 0.3)")
window.resizable(width=False,height=False)
window.configure(background="black")
background_img = PhotoImage(file = "./gif/background.gif")
imagelabelbackground_img = Label(window,image = background_img)
imagelabelbackground_img.place(x= -2, y=-2)

textLabel = Label(window, bg="black",fg="white")
textLabel.place(x=-2, y=880)

photomenu = PhotoImage(file = "gif/menu.gif")
btne = Button(window, image = photomenu, command = exitt, bg="dimgrey",bd =0)

photoplus = PhotoImage(file = "gif/plus.gif")
btnplus = Button(window, image = photoplus, command = func_zoominn, bg="white",bd =0)
photominus = PhotoImage(file = "gif/minus.gif")
btnminus = Button(window, image = photominus, command = func_zoomoutt, bg="white",bd =0)

photosun = PhotoImage(file = "gif/sun.gif")
btnsun = Button(window, image = photosun, command = func_brightt, bg="white",bd =0)
photomoon = PhotoImage(file = "gif/moon.gif")
btnmoon = Button(window, image = photomoon, command = func_darkk, bg="white",bd =0)

phototext = PhotoImage(file = "gif/text.gif")
btna = Label(window, image = phototext, bg="dimgrey",bd =0)
btna.bind("<Button-1>",clickLeft)
btnplus.place(x = 940, y = 393)
btnminus.place(x = 990, y = 393)
btnsun.place(x = 940, y = 443)
btnmoon.place(x = 990, y = 443)
btna.place(x = 483, y = 1)
btne.place(x = -2, y = -2)




# 메뉴 생성
#1. 메뉴 자체 생성
#메뉴 자체 이름 = Menu(부모 윈도우)
#부모 윈도우.config(menu=메뉴자체이름)
mainMenu = Menu(window)
window.config(menu=mainMenu)

#2.상위 메뉴생성
#상위메뉴이름 = Menu(메뉴자체이름)
#메뉴자체이름.add_cascade(label="상위 메뉴 텍스트", menu=상위메뉴이름)
#add_cascade() 메소드는 메뉴자체와 상위 메뉴를 연결
fileMenu = Menu(mainMenu,tearoff=0)
mainMenu.add_cascade(label="파일", menu=fileMenu)

#3.하위 메뉴생성
#상위메뉴이름.add_commend(label="하위 메뉴 이름", command=함수명)
#add_command() 메소드는 하위메뉴 항목생성
fileMenu.add_command(label="파일 열기",command=func_open)
fileMenu.add_command(label="파일 저장", state = "disable", command=func_save)
fileMenu.add_command(label = "리셋",state = "disable", command=func_reset)
fileMenu.add_separator() #구분선 삽입
fileMenu.add_command(label = "이미지 삭제",state = "disable", command=canvas_close)
fileMenu.add_command(label = "종료",command=func_exit)

#2.상위 메뉴생성

image1Menu = Menu(mainMenu,tearoff=0) # tearoff=0 점선 삭제
mainMenu.add_cascade(label="이미지 처리(1)",state = "disable", menu=image1Menu)

#3.하위 메뉴생성
iMenu = Menu(image1Menu,tearoff=0)
image1Menu.add_cascade(label="안경", menu=iMenu)
iMenu.add_command(label="확대",command=func_zoomin)
iMenu.add_command(label="축소",command=func_zoomout)

mMenu = Menu(image1Menu,tearoff=0)
image1Menu.add_cascade(label="거울", menu=mMenu)
mMenu.add_command(label="상하 반전",command=func_mirror1)
mMenu.add_command(label="좌우 반전",command=func_mirror2)

aMenu = Menu(image1Menu,tearoff=0)
image1Menu.add_cascade(label="돌려", menu=aMenu)
aMenu.add_command(label="회전",command=func_rotate)

#2.상위 메뉴생성

image2Menu = Menu(mainMenu,tearoff=0)
mainMenu.add_cascade(label="이미지 처리(2)",state = "disable", menu=image2Menu)

#3.하위 메뉴생성
gMenu = Menu(image2Menu,tearoff=0)
image2Menu.add_cascade(label="눈 부셔", menu=gMenu)
gMenu.add_command(label="밝게",command=func_bright)
gMenu.add_command(label="어둡게",command=func_dark)

eMenu = Menu(image2Menu,tearoff=0)
image2Menu.add_cascade(label="선악", menu=eMenu)
eMenu.add_command(label="선명하게",command=func_clear)
eMenu.add_command(label="탁하게",command=func_unclear)
eMenu.add_command(label="흑백이미지",command=func_bw)

window.mainloop()
