package com.bootcamp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] resultArray = new int[10];
        int idx = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = scanner.next().charAt(0);

            int result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    resultArray[idx++] = result;
                    System.out.println("결과 : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    resultArray[idx++] = result;
                    System.out.println("결과 : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    resultArray[idx++] = result;
                    System.out.println("결과 : " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    resultArray[idx++] = result;
                    System.out.println("결과 : " + result);
                    break;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = scanner.next();

            if (answer.equals("exit")) {
                break;
            }
        }
    }
}