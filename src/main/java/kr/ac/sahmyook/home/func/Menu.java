package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class Menu {
    public static void mainMenu() {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 변수 테스트\n" +
                    "2. 기본 자료형 테스트\n" +
                    "3. if문 테스트\n" +
                    "4. switch문 테스트\n" +
                    "5. for문 테스트\n" +
                    "6. while문 테스트\n" +
                    "7. do~while문 테스트\n" +
                    "8. break문 테스트\n" +
                    "9. continue문 테스트\n" +
                    "10. static 메소드 사용 테스트\n" +
                    "11. non-static 메소드 사용 테스트\n" +
                    "12. 프로그램 종료\n" +
                    "메뉴 번호 입력 :");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    VariableSample.subVarMenu();
                    break;
                case 2:
                    PrimitiveTypeSample.subPTypeMenu();
                    break;
                case 3:
                    IfSample.subIfMenu();
                    break;
                case 4:
                    SwitchSample.subSwitchMenu();
                    break;
                case 5:
                    ForSample.subForMenu();
                    break;
                case 6:
                    WhileSample.subWhileMenu();
                    break;
                case 7:
                    DoWhileSample.subDoWhileMenu();
                    break;
                case 8:
                    BreakSample.subBreakMenu();
                    break;
                case 9:
                    ContinueSample.subContinueMenu();
                    break;
                case 10:
                    StaticMethodSample.subStaticMethodMenu();
                    break;
                case 11:
                    NonStaticMethodSample.subNonStaticMethodMenu();
                    break;
                case 12:
                    System.out.println("정말로 종료 하시겠습니까? (예:y 아니오:n) :");
                    String exit = sc.next();
                    if (exit == "y") {
                        System.exit(0);
                    } else mainMenu();
                    break;
                default:
                    if (no > 12) {
                        mainMenu();
                    }
                    break;


            }
        } while (true);
    }
}
