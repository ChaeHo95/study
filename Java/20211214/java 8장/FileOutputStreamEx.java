package Java8;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7,51,3,4,-1,21};

        try {
            FileOutputStream fout= new FileOutputStream("c:\\Temp\\test.out");
            for(int i=0; i<b.length; i++){
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            }
            fout.close();
        }catch (IOException e){
            System.out.println("c:\\Temp\\test.out에 저장할 수 없습니다. \n 경로명을 확인 해주세요.");
            return;
        }
        System.out.println("c:\\Temp\\test.out를 저장하였습니다.");
    }
}
