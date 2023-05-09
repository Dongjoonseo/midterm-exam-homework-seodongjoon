package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ContinueSample {
        public static void subContinueMenu(){
            do{
                Scanner sc = new Scanner(System.in);
                System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\n" +
                        "2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\n" +
                        "3. 이전 메뉴로 가기\n" +
                        "메뉴 선택 : ");

                int no = sc.nextInt();

                switch(no) {
                    case 1: sumJumpThree();
                        break;
                    case 2: rowColJump();
                        break;
                    case 3: System.out.println("메인 메뉴로 돌아갑니다.");
                        return;
                    default: if( no > 3 || no < 0){
                        subContinueMenu();
                    }
                }}while(true);
        }
        public static void sumJumpThree(){
            System.out.println("sumJumpThree() 실행됨");
        }
        public static void rowColJump(){
            System.out.println("minNumber() 실행됨");
        }
    }

