myList = [30,10, 20]
print("현재 리스트 : %s"%myList)

myList.append(40) # 리스트 제일 뒤에 항목을 추가한다.
print("append(40) 후의 리스트 : %s"%myList.pop())

print("pop()으로 추출한 값 : %s"%myList.pop())
print("pop() 후의 리스트 : %s"%myList)
#리스트 제일 뒤의 항목을 빼내고, 빼낸 항목은 삭제

myList.sort()#리스트의 항목을 정렬
print("sort()후의 리스트 : %s"%myList)

myList.reverse() #리스트 항목를 역순으로 만
print("reverse() 후의 리스트 %s" %myList)


print("20 값의 위치 : %d" %myList.index(30))
#지정한 값을 찾아서 그위치를 반환

myList.insert(2, 222) #지정된 위치에 값을 삽입
print("insert(2,222) 후의 리스트 : %s"%myList)

myList.remove(222) #리스트에서 지정한 값을 제거
print("remove(222) 후의 리스트 : %s"%myList)

myList.extend([77, 88, 77])# 리스트 뒤에 추가한다. 리스트의 더하기(+)
print("extend[77, 88, 77] 후의 리스트 : %s"%myList)

print("77 값의 개수 : %d"%myList.count(77))
#리스트에 포함된 전체 항목의 개수를 센다
