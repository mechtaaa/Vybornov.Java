import java.util.Scanner;

public class Algoritm {

    public static void main(String[] args) {
        Algoritm algoritm = new Algoritm();
        algoritm.questOne();
        algoritm.questTwo();
        algoritm.questThree();
    }
    public void questOne() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше 7");
        }
    }
    public void questTwo() {
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
        String exampleName = "Вячеслав";
        if (name.equalsIgnoreCase(exampleName)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public void questThree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String checkStr = in.nextLine();
        String strArr[] = checkStr.split(" ");
        int numberArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[-+]?\\d+")) {
                numberArr[i] = Integer.parseInt(strArr[i]);
                if (numberArr[i] % 3 == 0) {
                    System.out.println(numberArr[i]);
                }
            }
        }
    }
}
// questFor()
// Дана скобочная последовательность: ["("(())()(())]"]"   - "" выделено где не правильно
//- Можно сделать по другому:[(())()(())] или [[((())()(()))]]