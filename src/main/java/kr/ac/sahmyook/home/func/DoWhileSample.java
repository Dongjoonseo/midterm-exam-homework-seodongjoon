package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    DoWhileSample dws = new DoWhileSample();
        public static void subDoWhileMenu(){

            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\n" +
                        "2. 버거킹 메뉴 주문 테스트(버거킹 메뉴 출력하고 반복적으로 메뉴를 선택 받아 최\n" +
                        "종적으로 선택한 메뉴들과 총 가격 출력하기)\n" +
                        "3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\n" +
                        "4. 이전 메뉴로 가기\n" +
                        "메뉴 선택 : ");
                int no = sc.nextInt();

                switch (no) {
                    case 1:
                        addDashToken();
                        break;
                    case 2:
                        burgerKingMenu();
                        break;
                    case 3:
                        isStringAlphabet();
                        break;
                    case 4:
                        System.out.println("메인 메뉴로 돌아갑니다.");
                        return;
                    default:
                        if (no > 6 || no < 0) {
                            subDoWhileMenu();
                        }
                }
            }while (true) ;
        }

        public static void addDashToken(){
            System.out.println(" addDashToken() 실행됨");
        }

        public static void burgerKingMenu(){
            System.out.println("burgerKingMenu() 실행됨");
        }
        public static void  isStringAlphabet() {
            System.out.println("numberGame() 실행됨");
        }
    }

