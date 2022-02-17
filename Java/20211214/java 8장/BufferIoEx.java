package Java8;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferIoEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out,5);
            // 파일 데이터를 모두 스크린에 출력
            while ((c = fin.read())!= -1){
                out.write(c);
            }
            // 파일 데이터가 모두 출력된 상태
            new Scanner(System.in).nextLine(); // <Enter>키 입력
            out.flush();
            fin.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
