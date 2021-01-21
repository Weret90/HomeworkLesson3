import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class guessingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {
                "apple", //0
                "orange", //1
                "lemon", //2
                "banana", //3
                "apricot", //4
                "avocado", //5
                "broccoli", //6
                "carrot", //7
                "cherry", //8
                "garlic", //9
                "grape", //10
                "melon", //11
                "leak", //12
                "kiwi", //13
                "mango", //14
                "mushroom", //15
                "nut", //16
                "olive", //17
                "pea", //18
                "peanut", //19
                "pear", //20
                "pepper", //21
                "pineapple", //22
                "pumpkin", //23
                "potato" //24
        };
        Random random = new Random();
        int x = random.nextInt(25); //случайное число от 0 до 24, по индексам элементов в массиве words
        String trueAnswer = words[x]; //trueAnswer - случайно выбранное слово из массива words
        char[] lettersOfTrueAnswer = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}; //массив из 15 символов, в который будут заносится правильные буквы
        while (true) {
            String userAnswer = scanner.next(); //пользователь вводит слово
            if (trueAnswer.equals(userAnswer)) { //если слово совпадает с загаданным то игра заканчивается
                System.out.println("Поздравляю вы угадали");
                break;
            }
            if (userAnswer.length() <= trueAnswer.length()) { //если длина введенного слова меньше или равно длине загаданного слова
                for (int i = 0; i < userAnswer.length(); i++) {
                    if (userAnswer.charAt(i) == trueAnswer.charAt(i)) { //сравниваем посимвольно слова
                        lettersOfTrueAnswer[i] = userAnswer.charAt(i); //если символы равны, они заносятся в массив из 15 символов
                    }
                    if (i == userAnswer.length() - 1) { //в конце цикла выводим массив символов с совпадающими символами на экран
                        System.out.println(Arrays.toString(lettersOfTrueAnswer));
                    }
                }
            }
            if (userAnswer.length() > trueAnswer.length()) { //если длина введенного слова больше длины загаданного слова
                for (int i = 0; i < trueAnswer.length(); i++) {
                    if (userAnswer.charAt(i) == trueAnswer.charAt(i)) {
                        lettersOfTrueAnswer[i] = userAnswer.charAt(i);
                    }
                    if (i == trueAnswer.length() - 1) {
                        System.out.println(Arrays.toString(lettersOfTrueAnswer));
                    }
                }
            }
        }
    }
}

