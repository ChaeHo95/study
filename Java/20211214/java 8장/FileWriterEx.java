package Java8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// 이미 생성된 파일에 내용 수정 또는 쓰기
public class FileWriterEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;

        int c;
        try {
            //파일과 연결된 출력 문자 스트림 생성
            fout = new FileWriter("c:\\Temp\\test.txt");

            while (true){
                // 빈칸을 포함하여 한 줄 읽기
                String line = sc.nextLine();
                // 한 줄에 <Enter>키만 입력한 경우
                if(line.length() == 0){
                    break;
                }
                // 읽은 문자열을 파일에 저장
                fout.write(line,0, line.length());
                // 한 줄 띄기 위해 \r\n을 파일에 저장
                // off부터 len개의 문자 출력
                fout.write("\r\n",0,2);
            }
            fout.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
        sc.close();

    }
}
