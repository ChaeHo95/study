package Java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {
    public static void main(String[] args) {
        //원본 파일 경로면
        File scr = new File("c:\\Users\\YJ\\Desktop\\gif\\img.jpg");
        // 복사 파일
        File dest = new File("c:\\Temp\\dest.jpg");
        try {
            // 파일 입력 바이트 스트림
            FileInputStream fi = new FileInputStream(scr);
            // 파일 출력 바이트 스트림
            FileOutputStream fo = new FileOutputStream(dest);
            // 10KB 버퍼
            byte[] buf = new byte[1021 * 10];
            while (true) {
                // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
                int n = fi.read(buf);
                // buf[0]부터 n 바이트 쓰기
                fo.write(buf, 0, n);
                if (n < buf.length) {
                    // 버퍼크기보다 작게 읽었기 때문에 파일 끝에 도달. 복사 종료
                    break;
                }
            }
            fi.close();
            fo.close();
            System.out.println(scr.getPath() + "를" + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }

    }
}
