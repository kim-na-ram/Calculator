package com.bootcamp;

import com.bootcamp.calculator.ArithmeticCalculator;
import com.bootcamp.calculator.Calculator;
import com.bootcamp.calculator.CircleCalculator;

import java.util.Scanner;

public class App {
    // Scanner 는 main 메서드 외에도 사용되므로 전역변수로 선언
    // 인스턴스 멤버는 static 메서드 내에 사용할 수 없으므로 static 선언
    // App 클래스 전역에서 사용되는 scanner 는 한 번만 초기화되도록 final 선언
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while (true) {
            System.out.println("연산 종류를 골라주세요.\n1) 사칙연산\n2) 원의 넓이 구하기");
            int opType = scanner.nextInt();

            if(opType == 1) {
                calculateBasicOperations(arithmeticCalculator);
            } else {
                calculateCircleArea(circleCalculator);
            }

            String answer;
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }

    public static void calculateBasicOperations(ArithmeticCalculator calculator) {
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = scanner.next().charAt(0);

        try {
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과 : " + result);

            String answer;
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = scanner.next();
            if (answer.equals("remove")) {
                calculator.removeResult();
            }

            printInquiry(calculator);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calculateCircleArea(CircleCalculator calculator) {
        System.out.print("반지름을 입력하세요 : ");
        int r = scanner.nextInt();

        try {
            double result = calculator.calculate(r);
            System.out.println("결과 : " + result);

            printInquiry(calculator);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printInquiry(Calculator calculator) {
        String answer;
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        answer = scanner.next();
        if (answer.equals("inquiry")) {
            calculator.inquiryResults();
        }
    }
}