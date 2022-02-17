package Java8;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        //비어 있는 byte 배열
        byte b[] = new byte[6];
        try {
            //"c:\Temp\test.out" 파일을 읽어 배열 b에 저장
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int n=0, c;
            // -1은 파일 끝(EOF)
            while ((c=fin.read())!=-1){
                //읽은 바이트를 배열에 저장
                b[n]= (byte) c;
                n++;

            }
            // 배열 b[]의 바이트 값을 모두 화면에 출력
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for (int i=0; i<b.length;i++){
                System.out.print(b[i]+ " ");
            }
            System.out.println();
        }catch (IOException e){
            System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. \n 경로명을 체크 해보세요.");
        }
    }
}
