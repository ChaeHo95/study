import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Word {
    private String Eng;
    private String Kor;

    public Word(String Eng, String Kor) {
        this.Eng = Eng;
        this.Kor = Kor;
    }

    public String toEngString() {
        return Eng;
    }

    public String ToKorString() {
        return Kor;
    }
}

public class OpenChallenge {
    public static void main(String[] args0) {
        Vector<Word> v = new Vector<Word>();
        Scanner sc = new Scanner(System.in);
        Iterator iter = v.iterator();
        Random rd = new Random();
        v.add(new Word("Love", "사랑"));
        v.add(new Word("Baby", "아기"));
        v.add(new Word("Sex", "성별"));
        v.add(new Word("Name", "이름"));
        v.add(new Word("Yes", "네"));
        v.add(new Word("No", "아니요"));
        v.add(new Word("Men", "남자"));
        v.add(new Word("Women", "여성"));
        v.add(new Word("Girl", "소녀"));
        v.add(new Word("Boy", "소년"));

        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다.");
        System.out.println("-1을 입력하면 종료합니다.");
        System.out.printf("현재 %d개의 단어가 들어있습니다. \n", v.size());
        int count = 0;
        String[] start = new String[1];
        String[] wordd = start;
        while (start.length != v.size()) {
            boolean duplication = false;
            // 문제 보여주기
            Word w = v.get(rd.nextInt(10));
            for (int i = 0; i < wordd.length; i++) {
                if (w.ToKorString().equals(wordd[i])) {
                    duplication = true;
                }
            }
            if (duplication == false) {
                System.out.printf("%s??? \n", w.toEngString());
                int wordcound = 0;
                while (wordcound != 1) {
                    wordcound = 0;
                    count = start.length - 1;
                    String[] WordList = new String[5];
                    for (int i = 0; i < 5; i++) {
                        Word s = v.get(rd.nextInt(10));
                        if (s == w) {
                            WordList[i] = w.ToKorString();
                            start[count] = w.ToKorString();
                            wordd = start;
                            wordcound++;
                        } else {
                            WordList[i] = s.ToKorString();
                        }
                        for (int j = 0; j < i; j++) {
                            if (WordList[j] != null && WordList[j].equals(s.ToKorString())) {
                                i--;
                            }
                        }
                    }
                    if (wordcound == 1) {
                        System.out.print("문제 :  ");
                        for (int i = 0; i < 5; i++) {
                            System.out.printf("(%d)%s \t", i + 1, WordList[i]);
                        }
                    }
                }
                System.out.println();

                String st = sc.next();
                if (st.equals("-1")) {
                    System.out.println("종료");
                    break;
                } else if (st.equals(w.ToKorString())) {
                    System.out.println("Exellent!!");
                } else {
                    System.out.println("No...");
                }

                count++;
                start = new String[count + 1];
                for (int i = 0; i < wordd.length; i++) {
                    start[i] = wordd[i];
                }

            }
        }

    }
}
