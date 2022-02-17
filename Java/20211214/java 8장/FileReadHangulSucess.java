package Java8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
// 파일 읽기
public class FileReadHangulSucess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        
        try {
            //읽을 한글 텍스트파일는 미리 작성되어 있어야지 불러 올수 있음.
            fin = new FileInputStream("c:\\Temp\\hangul.txt");
            // 올바른 문자 집합 지정
            in = new InputStreamReader(fin,"UTF8");
            int c;
            
            // in.getEncoding() 문자 집합 이름 리턴
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c= in.read()) != -1){
                System.out.print((char) c);
            }
            in.close();
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
