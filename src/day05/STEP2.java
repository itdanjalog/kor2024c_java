package day05; // - 현재 클래스가 위치한 패키지/폴더

import java.util.Scanner;

public class STEP2 { // 클래스 시작 중괄호 // 자바는 클래스 단위로 번역하기 때문에

    public static void main(String[] args) { // main함수 후 시작 중괄호 // 번역된 코드를 실행해주는 흐름 기능 포함

        // * 입력 객체 ( 1.키보드로부터 입력받기 위해 필요한 객체 변수)
        Scanner scan = new Scanner(System.in);
        // 실습1 : 기본급 과 수당 을 키보드로부터 정수 타입으로 각 입력받아서 실수령액 계산하여 출력하시오.
        // 실수령액 계산식 : 기본급 + 수당 - 세금   , 세금 계산식 : 기본급의 10%
        // 1. 정수타입으로 입력받아 (기본급) 변수에 저장
        System.out.print("[1] 기본급 입력 : ");
        int 기본급 = scan.nextInt();
        System.out.print("[1] 수당 입력 : ");
        int 수당 = scan.nextInt();
        // 2. 계산식
        int 세금  = (int)(기본급 * 0.1); // 0.1(double) // 1.기본급(int) 과 0.1(double) 2.곱한 결과를 int 로 강제타입
                // ( 10 + 10 ) * 2
                // 컴퓨터는 퍼센트 모른다???   * 1(100%) 0.1(10%) 10(1000%) 0.5(50%) 0.05(5%)
        int 실수령액 = 기본급 + 수당 - 세금;
        // 3. 결과 출력  , 연결 연산자
        System.out.println("[1] 실수령액 : " + 실수령액 );

        // 실습2 : 키보드로 부터 금액을 정수 타입으로 입력받아서 금액의 지폐수를 계산하여 출력하시오.
        // 단] 지폐수는 십만원 , 만원 , 천원
        // 입력 예시1 ] 356789  # 출력 예] 십만원:3장 , 만원:5장 , 천원:6장
        // 입력 예시2 ] 95720    # 출력 예] 십만원:0장 , 만원:9장 , 천원:5장

        // 1. 정수타입으로 입력받기
        System.out.print("[2] 금액 입력 : ");
        int 금액 = scan.nextInt();

        // 2. 지폐수 세기
            // (1) 십만원 계산은 금액의 나누기 100000를 해서 정수값 만 사용 한다. 예] 356789 -> 나누기 100000 -> 3.56789 -> 3
        int 십만원권 = 금액/100000;
        System.out.println("십만원 : " + 십만원권 + "장" );
            // (2) 만원 계산은 금액의 원금(원 금액에서 십만원권 제외) 확인
        금액 = 금액 - (십만원권*100000); // 금액 에서 십만원 단위 제거 # 356789 - 300000 -> 56789
            // (3) 만원권 세기
        int 만원권 = 금액/10000;
        System.out.println("만원권 : " + 만원권 );
            // (4) 금액의 원금( 원 금액에서 만원권 제외) 확인
        금액 -= 만원권 * 10000 ; // vs 금액 = 금액 - ( 만원권 * 10000 ) ;
        //  변수 -= 값   # 오른쪽 값을 왼쪽 값과 빼기(연산)를 한 후에 결과를 변수에 대입
        // 대입 기준으로 항상 오른쪽부터 코드 확인하고 읽기
            // (5)
        int 천원권 = 금액/1000;
        System.out.println("천원권 : " + 천원권 );





        // 실습3 : 키보드로 부터 국어,영어,수학 점수를 각 정수 타입으로 입력받아서 평균을 계산하여 평균 과 합격 여부 출력하시오.
        // 합격 여부 조건 : 평균이 80점 이상이면 '합격' 아니면 '불합격'

    } // main 함수 끝 중괄호
} // 클래스 끝 중괄호












