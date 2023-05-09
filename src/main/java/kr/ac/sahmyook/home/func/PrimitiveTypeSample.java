package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class PrimitiveTypeSample {
    PrimitiveTypeSample pts = new PrimitiveTypeSample();
    public static void subPTypeMenu() {

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("1. 기본자료형 메모리 크기(byte) 출력하기\n" +
                    "2. 이전 메뉴로 가기\n" +
                    "메뉴 선택 :");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    typeSize();
                    break;
                case 2:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    subPTypeMenu();
            }
        } while (true);
    }
    public static void typeSize(){
        System.out.println("typeSize() 실행됨");
    }
}
