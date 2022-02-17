import java.util.Scanner;

public class OpenChallenge {
    String readString(){
        StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트림버퍼 생성
        Scanner sc = new Scanner(System.in);

        while (true){
            String line = sc.nextLine(); //  텍스트 한 라인을 읽음
            if(line.equals(";")){break;} // ';'만 있는 라인이면 입력 끝
            sb.append(line); // 읽은 라인 문자열을 스트링버퍼에 추가
        }
        return  sb.toString(); // 스트링버퍼의 문자열을 스트링으로 리턴
    }

    public static void main(String[] args) {
        OpenChallenge op = new OpenChallenge();
        StringBuffer adcList[] = new StringBuffer[26]; // 알파벳은 개수는 26개
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        String text = op.readString();

        for(int i=0; i<text.length(); i++){
            int abc = 0;
            char checks  = text.toUpperCase().charAt(i);
            for(int j='A'; j<'Z'+1; j++){
                if (checks == j){
                    if(adcList[abc] == null){
                        adcList[abc] = new StringBuffer((char)j + "\t"); // StringBuffer 로 형 변환
                    }
                    adcList[abc].append('-');
                    break;
                }
                abc++;
            }

        }
        for(int i=0; i< adcList.length; i++){
            if(adcList[i] == null){
                continue;
            }
            System.out.printf("%s 개수는 %d \n",adcList[i], adcList[i].length()-2);
            // 먼저 입력한 알파벳 과 \t의 개수를 빼기위해 -2
        }

    }
}
