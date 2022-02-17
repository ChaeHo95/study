public class GenericMaethodEx {
    public static <T>Gstack<T> reverse(Gstack<T> a){ // T가 타입 매개변수인 재네릭 메소드

        Gstack<T> s = new Gstack<T>(); // 스택 a를 반대로 저장할 목적 GStack 생성
        while(true){
            T tmp;
            tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
            if(tmp == null){ // 스택이 비었음
                break; // 거꾸로 만드는 작업 종료
            }
            else{
                s.push(tmp);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Gstack<Double> gs = new Gstack<Double>(); // Double 타입의 Gstack 생성

        for(int i=0; i<5; i++){ // 5개의 요소를 스택에 push
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for(int i=0; i<5; i++){
            System.out.println(gs.pop());
        }
    }
}
