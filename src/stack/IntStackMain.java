package stack;

import java.util.Arrays;
import java.util.Scanner;

public class IntStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 수 : %d / %d%n", stack.size(), stack.getCapacity());
            System.out.print("1 푸시, 2 팝, 3 피크, 4 덤프, 0 종료");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int number;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    number = sc.nextInt();
                    stack.push(number);     //ctrl + Alt + T
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}
