package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class StaticMethodSample {
        public static void subStaticMethodMenu(){
            do{
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력\n" +
                        "2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기\n" +
                        "3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기\n" +
                        "4. 이전 메뉴로 가기\n" +
                        "메뉴 선택 : ");

                int no = sc.nextInt();

                switch(no) {
                    case 1: testMathRandom();
                        break;
                    case 2: testMathAbs();
                        break;
                    case 3: testMathMax();
                        break;
                    case 4: System.out.println("메인 메뉴로 돌아갑니다.");
                        return;
                    default: if( no > 4 || no < 0){
                        subStaticMethodMenu();
                    }
                }}while(true);
        }
        public static void testMathRandom(){
            System.out.println("testMathRandom() 실행됨");
        }
        public static void testMathAbs(){
            System.out.println("testMathAbs() 실행됨");
        }
        public static void testMathMax(){
            System.out.println("testMathMax() 실행됨");
    }
    }

