package test7_12.Word;

public class Words {
    public String[] words(int i){
        String[] kors = {"사랑", "아기", "성별", "이름", "네", "아니요", "남자", "여자", "소녀", "소년"};
        String[] engs = {"Love","Baby","Sex","Name","Yes","No","Men","Women","Girl","Boy"};

        String[] words = {engs[i],kors[i]};
        return words;
    }
}

