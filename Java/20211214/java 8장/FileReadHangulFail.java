package Java8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// 파일 읽기
public class FileReadHangulFail {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            // 파일로부터 바이트 입력 스트림 생성
            fin = new FileInputStream("c:\\Temp\\hangul.txt");

            in = new InputStreamReader(fin,"US-ASCII");
            int c;

            // in.getEncoding() 문자 집합 이름 리턴
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c= in.read()) != -1){ // 문자 단위로 읽음
                System.out.print((char) c);
            }
            in.close();
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}