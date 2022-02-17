package test6_10_12.Main;

import test6_10_12.Person.Person;
import test6_10_12.System.Sysyem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sysyem g = new Sysyem();
        boolean games = true;
        System.out.println("참가 인원 수를 입력 해주세요.");
        Person[] persons = new Person[sc.nextInt()];
        for (int i=0; i< persons.length; i++){
            System.out.println("참가자 이름을 적어주세요 >> ");
            persons[i] = new Person();
            persons[i].setName(sc.next());
        }
        System.out.println("겜블링 게임 시작");
        sc.nextLine(); // 토큰을 비워주지 않으면 처음 그냥 바로 시작하는 것 같음
        while (games) {
            for (int i=0; i< persons.length; i++){

                System.out.printf("[%s]님 게임을 시작을 원하시면 <Enter>키 누르세요.",persons[i].getName());

                sc.nextLine();

                if(g.game()){
                    System.out.printf("%s님이 이기셨습니다.",persons[i].getName());
                    games = false;
                    break;
                }
                else {
                    System.out.println("아쉽네요");
                }
            }
        }
    }
}
