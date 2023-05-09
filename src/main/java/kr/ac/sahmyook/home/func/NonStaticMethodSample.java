package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {
    NonStaticMethodSample nsms = new NonStaticMethodSample();
        public static void subNonStaticMethodMenu(){
            do{
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\n" +
                        "2. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\n" +
                        "3. 이전 메뉴로 가기\n" +
                        "메뉴 선택 : ");

                int no = sc.nextInt();

                switch(no) {
                    case 1: testScanner();
                        break;
                    case 2: testRandom();
                        break;
                    case 3: System.out.println("메인 메뉴로 돌아갑니다.");
                        return;
                    default: if( no > 3 || no < 0){
                        subNonStaticMethodMenu();
                    }
                }}while(true);
        }
        public static void testScanner(){
            System.out.println("testScanner() 실행됨");
        }
        public static void testRandom(){
            System.out.println("testRandom() 실행됨");
        }
    }
