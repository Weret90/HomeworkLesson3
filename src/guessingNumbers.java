import java.util.Random;
import java.util.Scanner;

public class guessingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int x = random.nextInt(10); //программа загадывает число от 0 до 9
            System.out.println("Попробуйте загадать загаданное компьютером число от 0 до 9. У вас три попытки");
            for (int i = 0; i <= 3; i++) {
                if (i == 3) { // i - количество попыток, если оно равно 3 игра заканчивается (дается три попытки: 0, 1 и 2)
                    System.out.println("Вы исчерпали 3 попытки, вы проиграли. Правильный ответ " + x);
                    break;
                }
                int userAnswer = scanner.nextInt(); //пользователь вводит число
                if (userAnswer == x) { //если число равно загаданному игра заканчивается
                    System.out.println("Поздравляю. Вы угадали!");
                    break;
                } else if (userAnswer < 0 || userAnswer > 9) { // если число вне пределов загаданного числа то программа предупредит об этом
                    System.out.println("Вы ввели число вне допустимых пределов");
                }else if (userAnswer < x) {
                    System.out.println("Вы не угадали: загаданное число больше");
                } else if (userAnswer > x) {
                    System.out.println("Вы не угадали: загаданное число меньше");
                }
            }
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет"); //в конце дается выбор закончить игру, при желании можно выйти из игры нажав 0
            int b = scanner.nextInt();
            if (b == 0) {
                break;
            }
        }
    }
}
