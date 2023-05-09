package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public static void subVarMenu() {
        do {
            VariableSample vs = new VariableSample();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 내 신상정보 변수에 담아 출력하기\n" +
                    "2. 사원정보를 키보드로 입력받아 출력하기\n" +
                    "3. 이전 메뉴로 가기\n" +
                    "메뉴 선택 :");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    myProfile();
                    break;
                case 2:
                    empInformation();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                  return;
                default:
                    subVarMenu();
            }
        } while (true);
    }

    public  static void myProfile(){
        System.out.println("myProfile() 실행됨");
    }

    public static void empInformation(){
        System.out.println("empInformation() 실행됨");
    }
}
