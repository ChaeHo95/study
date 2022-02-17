# 딕셔너리 : 인덱스가 아닌 키로 값을 지정
# 리스트이 인덱스 대신 키 사용, 딕셔너리는 키를 이용하여 값을 찾아낼 때 편리
# 딕셔너리는 리스트와 달리 값을 순서를 지켜주지 않는다.

# 학생정보의 리스트 표현
stundent1=[20,'홍길동','빅데이터']

# 학생정보의 딕셔너리 표현
stundent2={'학번':20,'이름':'홍길동','전':'빅데이터'}
print(student2[0],student2['이름'],student2['전공'])
print(student2[1])
#print(student2[1]) #인덱스로 호출시 에러남, 키로 출력

# 딕셔너리에 값 추가
print(student2)
student2['연락처'] = '010-123-4567'
print(student2)
student2['연락처'] = '010-123-0000'
print(student2)

#딕셔너리는 remove(),append() 함수를 적용할 수 없다.
# student2.append('010-123-4567')

student2.pop('전공') #pop()함수로 딕셔너리의 특정키의 값 삭제
print(student2)
del(student2['이름']) #del구문으로 딕셔너리의 특정키의 값 삭제
print(student2)
#딕셔너리와 리스트의 공통점, 투플은 수정 불가
student2.clear() #clear() 함수를 사용하면 딕셔너리의 리스트의 내용이 모두 지워짐
print(student2)
