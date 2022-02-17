package test6_6.main;

import java.util.Scanner;
import test6_6.person.Timeset;
import test6_6.sum.Sum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum = new Sum();
        Timeset expect = new Timeset("a");
        Timeset nowSecond = new Timeset("b");
        Timeset[] persons;
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        while (true) {
            System.out.println("참가 인원 수를 적어주세요.(최소 두명)");
            persons = new Timeset[sc.nextInt()];
            if(persons.length > 1){
                break;
            }
            else {
                System.out.println("참가인원이 부족합니다.");
            }
        }

        System.out.println("참가자 이름을 적어주세요.");
        for(int i=0; i<persons.length; i++){
            System.out.printf("%d번째 참가자의 이름 >> ",i+1);
            persons[i] = new Timeset(sc.next());
        }
        System.out.println("게임을 시작합니다.");
        while (true) {
            for (int i = 0; i < persons.length; i++) {
                System.out.printf("\n%s 시작 <Enter>키 >>\n", persons[i].getPerson());
                sc.nextLine();
                System.out.printf("현재 초 시간은 %s초 \n", nowSecond.printnow());
                System.out.println("10초 예상 후 <Enter>키 >>");
                sc.nextLine();
                System.out.printf("현재 초 시간은 %s초\n", expect.printnow());
                persons[i].setTime(Math.abs(sum.resultTime(nowSecond,expect)));
            }

            for (int i = 0; i < persons.length; i++) {
                System.out.printf("%s의 결과 %d \t", persons[i].getPerson(), persons[i].gettime());
            }
            int result = 0;
            for (int i = 0; i < persons.length; i++) {
                if (i == 0) {
                    result = Math.min(persons[i].gettime(), persons[i + 1].gettime());
                }
                else {
                    result = Math.min(persons[i].gettime(), result);
                }
            }
            int count = 0;
            int winner = 0;
            for (int i = 0; i < persons.length; i++) {
                if (result == persons[i].gettime()) {
                    winner = i;
                    count++;
                }
            }
            if(count == 1){
                System.out.printf("승자는 %s", persons[winner].getPerson());
                break;
            }
            else {
                System.out.println("우승자는 단 한명밖에 없습니다.");
            }
        }
    }
}
