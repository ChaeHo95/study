# 주어진 리스트 안의 자료를 작은 수부터
# 큰 수 순서로 배열하는 정렬 알고리즘을 만들어 보세요.
# 리스트에 들어 있는 숫자를 크기 순으로 나열하는 정렬 알고리즘의 입출력

# 2. 일반적으로  설명한 선택 정렬 알고리즘
# 입력으로 주어진 리스트 a 안에서 직접 자료의 위치를 바꾸면서
# 정렬시키는 프로그램
# 입력: 리스트 a

a = [2, 4, 5, 1, 3] # 주어진 리스트
print("a",a)
    
n = len(a)    # 리스트 a의 길이만큼 반복 실행
for i in range(0, n - 1):  # 0부터 n-2까지 반복
    min_idx = i # 최소값 인덱스, 초기값 i번째로 지정
    
    for j in range(i+1, n):
        print("%d 와 %d의 비교" % (min_idx,j))
        if a[j] < a[min_idx]:       # 리스트 최소값 인덱스번째와 i번째 값 비교
            min_idx = j             # i번째가 최소값 인덱스번째 보다 적을 경우 i인덱스를 최소값 인덱스로 지정
    # 찾은 최솟값을 i번 위치, i번째 값을 최소값 위치로 동시 교환
    # 파이썬에서 두 자료 값 서로 바꾸기
    a[i], a[min_idx] = a[min_idx], a[i]
    print("min_idx", min_idx)
    print("a",a)

print("선택 정렬 알고리즘 결과",a)

