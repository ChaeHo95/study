package Java8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopyEx {
    public static void main(String[] args) {
        // 원본 파일 경로명
        File src = new File("c:\\windows\\system.ini");
        // 복사 파일 경로명
        File dest = new File("c:\\Temp\\system.txt");
        
        int c;
        try {
            // 파일 입력 문자 스트림 생성
            FileReader fr = new FileReader(src);
            //파일 출력 문자 스트림 생성
            FileWriter fw = new FileWriter(dest);
            //문자 하나 읽고
            while ((c = fr.read()) != -1){
                // 문자 하나 쓰고
                fw.write((char)c);
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사하였습니다.");
        }catch (IOException e){
            System.out.println("파일 복사 오류");
        }
    }
}
