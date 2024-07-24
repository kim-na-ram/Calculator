package com.bootcamp;

import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("연산 종류를 골라주세요.\n1) 사칙연산\n2) 원의 넓이 구하기");
            int opType = scanner.nextInt();

            if(opType == 1) {
                calculateBasicOperations(calculator);
            } else {
                calculateCircleArea(calculator);
            }

            String answer;
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }

    public static void calculateBasicOperations(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = scanner.next().charAt(0);

        try {
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("결과 : " + result);

            String answer;
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = scanner.next();
            if (answer.equals("remove")) {
                calculator.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = scanner.next();
            if (answer.equals("inquiry")) {
                calculator.inquiryResults();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calculateCircleArea(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("반지름을 입력하세요 : ");
        int r = scanner.nextInt();

        try {
            double result = calculator.calculateCircleArea(r);
            System.out.println("결과 : " + result);

            String answer;
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = scanner.next();
            if (answer.equals("inquiry")) {
                calculator.inquiryCircleAreaResults();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}