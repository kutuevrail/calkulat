package calculat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Считываем данные и записываем в переменную
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите два числа по типу ( 2 + 3): ");
        String number = in.nextLine();


        //Убираем все пробелы и создаем строку в котором будут храниться веденные данные с оператором
        //И массив с двумя веденными числами


        String numberOnly = "";
        for (String str : number.split(" ")) {
            numberOnly += str;
        }
            String[] strings = numberOnly.split("[*+-/]");


            //Проверка через регулярное вырыжение на содержание чисел или римских цифр

            if ((numberOnly.matches(".*(I|V|X|-|\\+|\\*|/).*") && !numberOnly.matches(".*([0-9]+).*"))) {
                System.out.println(MathRom.mathRim(strings, numberOnly));
            } else if ((numberOnly.matches(".*([0-9]+|-|\\+|\\*|/).*") && !(numberOnly.matches(".*(I|V|X).*")))) {
                System.out.println(MathArab.mathArab(strings, numberOnly));
            } else {
                throw new ArithmeticException();
            }
        }
    }
