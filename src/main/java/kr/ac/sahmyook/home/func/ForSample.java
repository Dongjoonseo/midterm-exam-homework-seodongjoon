package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    ForSample fs = new ForSample();

    public static void subForMenu(){

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 1~10까지 정수들의 합계 구하기\n" +
                    "2. 1~100사이의 짝수들의 합게 구하기\n" +
                    "3. 정수 하나 입력받아, 그 수의 구구단 출력하기\n" +
                    "4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\n" +
                    "5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\n" +
                    "6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기\n" +
                    "7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼\n" +
                    "각형)\n" +
                    "8. 구구단 2단부터 9단까지 출력하기\n" +
                    "9. 이전 메뉴로 가기\n" +
                    "메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    sum1To10();
                    break;
                case 2:
                    sumEven1To100();
                    break;
                case 3:
                    oneGugudan();
                    break;
                case 4:
                    sumMinToMax();
                    break;
                case 5:
                    printStar();
                    break;
                case 6:
                    printNumberStar();
                    break;
                case 7:
                    printTriangleStar();
                    break;
                case 8:
                    guguDan();
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    if (no > 9 || no < 0) {
                        subForMenu();
                    }
            }
        }while (true) ;

        }

    public  static void sum1To10(){
        System.out.println("sum1To10() 실행됨");
    }

    public static void sumEven1To100(){
        System.out.println("sumEven1To100() 실행됨");
    }
    public static void oneGugudan(){
        System.out.println("oneGugudan() 실행됨");
    }
    public static void sumMinToMax(){
        System.out.println("sumMinToMax() 실행됨");
    }
    public static void printStar(){
        System.out.println("printStar() 실행됨");
    }
    public static void printNumberStar(){
        System.out.println("printNumberStar() 실행됨");
    }
    public static void printTriangleStar(){
        System.out.println("printTriangleStar() 실행됨");
    }
    public static void guguDan(){
        System.out.println("guguDan() 실행됨");
    }
}
