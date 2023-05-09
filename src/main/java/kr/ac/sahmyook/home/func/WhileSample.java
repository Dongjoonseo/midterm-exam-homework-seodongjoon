package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    public static void subWhileMenu(){

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)\n" +
                    "2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)\n" +
                    "3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\n" +
                    "4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\n" +
                    "5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\n" +
                    "6. 이전 메뉴로 가기\n" +
                    "메뉴 선택 : ");
            int no = sc.nextInt();
            WhileSample ws = new WhileSample();
            switch (no) {
                case 1:
                    printUniCode();
                    break;
                case 2:
                    sum1To100();
                    break;
                case 3:
                    numberGame();
                    break;
                case 4:
                    countCharacter();
                    break;
                case 5:
                    countInChar();
                    break;
                case 6:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    if (no > 6 || no < 0) {
                        subWhileMenu();
                    }
            }
        }while (true) ;
    }



    public static void  printUniCode(){
        System.out.println(" printUniCode() 실행됨");
    }

    public static void sum1To100(){
        System.out.println("sum1To100() 실행됨");
    }
    public static void  numberGame() {
        System.out.println("numberGame() 실행됨");
    }
    public static void countCharacter(){
        System.out.println("sumMinToMax() 실행됨");
    }
    public static void countInChar(){
        System.out.println("printStar() 실행됨");
    }
}

