# 1차원 배열
#list1 = []
#
#for i in range(0,10):
#    list1.append(i)
#    print(i)

#2차원 배열
list1 = []
list2 = []
value = 1
for i in range(0,3):
    for k in range(0,4):
        list1.append(value)
        value += 1
        print(list1)
    list2.append(list1)              
    print(list2)
    list1 = []

print(list2)    
print(list2)
  
# 2차원 리스트의 값을 출력하기, 하나하나 출력하기
for i in range(0,3):
    for k in range(0,4):
        print("%3d"%list2[i][k],end ="") 
    print("")

