list = []
value = 0
v = 1
for i in range(0,10):
        list.append(value)
        list.reverse()
        value += 1


while True:
        try:
                print(f"0~{v-1}9의 리스트가 존재 합니다.")
                a = int(input("탐색할 값을 입력해주시오 :"))
                        
                if a in list :
                        for e in range(0,len(list)) :
                                if a == list[e] :
                                        print(f"{a} 값의 위치는 : {e+1}번째 위치에 있습니다.")
                                        list.reverse()
                                        v += 1
                                        for i in range(0,10):
                                                list.append(value)
                                                list.reverse()
                                                value += 1

                if not a in list : 
                        print("리스트 안에 값을 입력 해주세요 제발!.")
                        continue
                                
                b = str(input("종료를 원하시면 '종료'를 입력. \n계속 하길 원할 시 '계속' 입력. "))
                if b == "종료":
                        break
                elif b == "계속" :
                        continue
                else :
                        print("'종료'나'계속' 중에 적어주세요! \n 말 좀 들어주세요!")
                        break
                        
                        
        except ValueError:
                print("정수를 입력해주세요.")
                continue

        

