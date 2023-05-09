package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {


   IfSample is = new IfSample();

    public static void subIfMenu(){
      do{
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기\n" +
                "2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기\n" +
                "3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기\n" +
                "4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\n" +
                "5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\n" +
                "6. 점수를 입력받아, 학점 확인하기\n" +
                "7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\n" +
                "8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확\n" +
                "인하기\n" +
                "9. 이전 메뉴로 가기\n" +
                "메뉴 선택 :");

        int no = sc.nextInt();

        switch(no) {
            case 1: maxNumber();
            break;
            case 2: minNumber();
            break;
            case 3: threeMaxMin();
            break;
            case 4: checkEven();
            break;
            case 5: isPassFail();
            break;
            case 6: scoreGrade();
            break;
            case 7: checkPlusMinusZero();
            break;
            case 8: whatCaracter();
            break;
            case 9: System.out.println("메인 메뉴로 돌아갑니다.");
                return;
            default: if( no > 9 || no < 0){
                subIfMenu();
            }
        }}while(true);
    }
    public static void maxNumber(){
        System.out.println("maxNumber() 실행됨");
    }
    public static void minNumber(){
        System.out.println("minNumber() 실행됨");
    }
    public static void threeMaxMin(){
        System.out.println("threeMaxMi() 실행됨");
    }
    public static void checkEven(){
        System.out.println("checkEven() 실행됨");
    }
    public static void isPassFail(){
        System.out.println("isPassFail() 실행됨");
    }
    public static void scoreGrade(){
        System.out.println("scoreGrade() 실행됨");
    }
    public static void checkPlusMinusZero(){
        System.out.println("checkPlusMinusZero() 실행됨");
    }
    public static void whatCaracter(){
        System.out.println("whatCaracterr() 실행됨");
    }
}
