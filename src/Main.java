import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int getMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    private static List<Integer> getIntegerList(Scanner scanner, int count) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= count; i++) {
            System.out.print(String.format("Вкажіть значення %d-го елемента: ", i));
            int num = scanner.nextInt();
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вкажіть кількість елементів для пов'язаного списку: ");
        int n = scanner.nextInt();

        System.out.println();
        List<Integer> myLinkedList = getIntegerList(scanner, n);
        System.out.println();
        System.out.println("Мінімальне число серед елементів списку: " + getMin(myLinkedList));
        scanner.close();
    }
}