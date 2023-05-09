package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class BreakSample {
    BreakSample bs = new BreakSample();
    public static void subBreakMenu(){

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 1~100까지 정수들의 합계 출력하기(break문 사용)\n" +
                    "2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)\n" +
                    "3. 이전 메뉴로 가기\n" +
                    "메뉴 선택 :  ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    sumBreak();
                    break;
                case 2:
                    guguDanBreak();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    if (no > 3 || no < 0) {
                       subBreakMenu();
                    }
            }
        }while (true) ;
    }

    public static void sumBreak(){
        System.out.println(" printUniCode() 실행됨");
    }

    public static void guguDanBreak(){
        System.out.println("sum1To100() 실행됨");
    }
}

