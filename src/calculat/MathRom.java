package calculat;

public class MathRom {
    public static String mathRim(String[] strings, String operator) {
        int number1 = 0;
        int number2 = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("I")) {
                if (i == 0) {
                    number1 = 1;
                } else {
                    number2 = 1;
                }
            }
            if (strings[i].equals("II")) {
                if (i == 0) {
                    number1 = 2;
                } else {
                    number2 = 2;
                }
            }
            if (strings[i].equals("III")) {
                if (i == 0) {
                    number1 = 3;
                } else {
                    number2 = 3;
                }
            }
            if (strings[i].equals("IV")) {
                if (i == 0) {
                    number1 = 4;
                } else {
                    number2 = 4;
                }
            }
            if (strings[i].equals("V")) {
                if (i == 0) {
                    number1 = 5;
                } else {
                    number2 = 5;
                }
            }
            if (strings[i].equals("VI")) {
                if (i == 0) {
                    number1 = 6;
                } else {
                    number2 = 6;
                }
            }
            if (strings[i].equals("VII")) {
                if (i == 0) {
                    number1 = 7;
                } else {
                    number2 = 7;
                }
            }
            if (strings[i].equals("VIII")) {
                if (i == 0) {
                    number1 = 8;
                } else {
                    number2 = 8;
                }
            }
            if (strings[i].equals("IX")) {
                if (i == 0) {
                    number1 = 9;
                } else {
                    number2 = 9;
                }
            }
            if (strings[i].equals("X")) {
                if (i == 0) {
                    number1 = 10;
                } else {
                    number2 = 10;
                }
            }
        }
        //Вызываем метод для арифмитической орперации и конвертируем ответ
        int result = Operation.operation(number1, number2, operator);
        return ConvertNumber.ConvertNumber(result);

    }
}