import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = Main.calc(input);
        System.out.println(result);
    }

    public static String calc(String input) throws Exception {
        String[] inputs = input.split(" ");
        if (inputs.length != 3) {
            throw new Exception();
        }
        String operation = inputs[1];

        int value1 = Integer.parseInt(inputs[0]);
        int value2 = Integer.parseInt(inputs[2]);
        if (value1 > 10 || value2 > 10) {
            throw new Exception();
        }

        if (value1 < 1 || value2 < 1) {
            throw new Exception();
        }
        int result;

        switch (operation) {
            case "+" -> result = value1 + value2;
            case "-" -> result = value1 - value2;
            case "*" -> result = value1 * value2;
            case "/" -> result = value1 / value2;
            default -> throw new Exception();

        }
        return String.valueOf(result);
    }
}