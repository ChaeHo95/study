package Java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
    public static void main(String[] args) {
        // 원본 파일 경로명
        File scr = new File("c:\\Users\\YJ\\Desktop\\gif\\img.jpg");
        File dest = new File("c:\\Temp\\copyimg.jpg");

        int c;
        try {
            // 파일 입력 바이트 스트림 생성
            FileInputStream fi = new FileInputStream(scr);
            // 파일 출력 바이트 스트림 생성
            FileOutputStream fo = new FileOutputStream(dest);

            while ((c=fi.read())!=-1){
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println(scr.getPath() + "를" + dest.getPath() + "로 복사하였습니다.");
        }
        catch (IOException e){
            System.out.println("파일 복사 오류");
        }
    }
}
