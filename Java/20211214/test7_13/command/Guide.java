package test7_13.command;

public class Guide {
    private String text;
    private String texts;

    public Guide(String text, String[] sa) {
        this.text = text;
        int n = -1;
        for (int i = 0; i < sa.length; i++) {
            if (text.equals(sa[i])) {
                n = i;
            }
        }
        switch (n) {
            case 0:
                this.texts = "mov 명령어는 변수명과 값을 정하는 명령어 \n 첫 변수는 총 결과값입니다.";
                break;
            case 1:
                this.texts = "add 명령어는 변수에 값을 더하는 더하는 명령어";
                break;
            case 2:
                this.texts = "sub 명령어는 변수에 값을 뺴는 더하는 명령어";
                break;
            case 3:
                this.texts = "jn0 명령어는 변수의 값이 0이 아닐 시, 원하는 명령 줄의 앞으로 이동하는 명령어";
                break;
            case 4:
                this.texts = "prt 명령어는 [prt 입력명 입력값] 식으로 보여주는 명령어";
                break;
            case 5:
                this.texts = "go 명령어는 입력 명령어들을 실행하는 명령어";
                break;
            case 6:
                this.texts = "exit 명령어는 프로그램을 종료하는 명령어";
                break;
        }
    }

    public String getTexts() {
        return texts;
    }
}
