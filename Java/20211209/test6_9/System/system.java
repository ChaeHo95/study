package test6_9.System;

import java.util.Random;

public class system {
    Random rd = new Random();
    public String resultgame(int num){
        String[] gtext = {"가위","바위","보"};
        int computer = rd.nextInt(3)+1;
        if(win(num,computer)){
            System.out.printf("사용자: %s\t컴퓨터: %s \n",gtext[num-1],gtext[computer-1]);
            return "사용자가 이겼습니다.";
        }
        else {
            System.out.printf("사용자: %s\t컴퓨터: %s \n",gtext[num-1],gtext[computer-1]);
            return "아쉽네요";
        }
    }

    public boolean win(int user, int computer){
        if(user == computer){
            System.out.println("무승부 입니다.");
            return false;
        } else if (computer == 1 && user == 3 || computer == 2 && user == 1 || computer == 3 && user == 2) {
            System.out.println("지셨습니다.");
            return false;
        }else {
            return true;
        }

    }
}

