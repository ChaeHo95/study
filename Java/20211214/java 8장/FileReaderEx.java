package Java8;

import java.io.FileReader;
import java.io.IOException;
// 파일 읽기
public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            // 문자 입력 스트림 생성
            // 스트림을 파일과 연결
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c = fin.read())!= -1){//문자 하나를 c에 읽어 들림, 파일 끝까지 반복
                System.out.print((char) c); // 문자 c를 화면에 출력
            }
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
