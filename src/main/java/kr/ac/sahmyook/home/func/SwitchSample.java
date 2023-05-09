package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    SwitchSample ss = new SwitchSample();

    public static void subSwitchMenu(){
      do{
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기\n" +
                "2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기\n" +
                "3. 이전 메뉴로 가기\n" +
                "메뉴 선택 : ");
        int no = sc.nextInt();

        switch(no) {
            case 1: calculator();
            break;
            case 2: fruitPrice();
            break;
            case 3: System.out.println("메인 메뉴로 돌아갑니다.");
              return;

                default:subSwitchMenu();
        }
    }while(true);

    }

    public  static void calculator(){
        System.out.println("calculator() 실행됨");
    }

    public static void fruitPrice(){
        System.out.println("fruitPrice() 실행됨");
    }
}
