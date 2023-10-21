
import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char numer = input.charAt(0);
        int sdf = Character.getNumericValue(numer);

        if(sdf == -1) {
            input.replace("\"", "");
        } else if(sdf > 1 || sdf < 10) {
            throw new RuntimeException("число не может являться первым аргументом");
        }

        input = input.replace("\"", "");
        char operand;

            String[] letters;

            if(input.contains("+")) {
                letters = input.split(" \\+ ");
                operand = '+';
            } else if(input.contains("-")) {
                letters = input.split(" - ");
                operand = '-';
            } else if(input.contains("*")) {
                letters = input.split(" \\* ");
                operand = '*';
            } else if(input.contains("/")) {
                letters = input.split(" / ");
                operand = '/';
            } else {
                throw new RuntimeException("Используйте операнд");
            }

            if(operand == '*' || operand == '/') {
                if (letters[1].contains("\"")) throw new RuntimeException("Число не может находится в кавычках");
            }
            for (int i = 0; i<letters.length; i++) {
                letters[i] = letters[i].replace("\"", "");
            }


        CalculateText lt = new CalculateText(letters[0], letters[1], operand);
        lt.firstValue = letters[0];
        lt.secondValue = letters[1];
        lt.operand = operand;
        System.out.println("\"" + lt.calc(lt.firstValue, lt.secondValue, lt.operand) + "\"");
        }

    }


