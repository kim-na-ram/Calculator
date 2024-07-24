package com.bootcamp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> resultQueue = new LinkedList<>();

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
                    resultQueue.offer(result);
                    System.out.println("결과 : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    resultQueue.offer(result);
                    System.out.println("결과 : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    resultQueue.offer(result);
                    System.out.println("결과 : " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    resultQueue.offer(result);
                    System.out.println("결과 : " + result);
                    break;
            }

            String answer;
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = scanner.next();
            if (answer.equals("remove")) {
                if(!resultQueue.isEmpty()) resultQueue.poll();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = scanner.next();
            if (answer.equals("inquiry")) {
                resultQueue.forEach(System.out::println);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}