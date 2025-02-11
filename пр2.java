import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Розмір byte: " + Byte.SIZE + " мінімум: " + Byte.MIN_VALUE + " максимум: " + Byte.MAX_VALUE);
        System.out.println("Розмір short: " + Short.SIZE + " мінімум: " + Short.MIN_VALUE + " максимум: " + Short.MAX_VALUE);
        System.out.println("Розмір int: " + Integer.SIZE + " мінімум: " + Integer.MIN_VALUE + " максимум: " + Integer.MAX_VALUE);
        System.out.println("Розмір long: " + Long.SIZE + " мінімум: " + Long.MIN_VALUE + " максимум: " + Long.MAX_VALUE);
        System.out.println("Розмір float: " + Float.SIZE + " мінімум: " + Float.MIN_VALUE + " максимум: " + Float.MAX_VALUE);
        System.out.println("Розмір double: " + Double.SIZE + " мінімум: " + Double.MIN_VALUE + " максимум: " + Double.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення для byte: ");
        String byteInput = scanner.nextLine();
        byte byteValue = Byte.parseByte(byteInput);
        System.out.println("Введене значення byte: " + byteValue);

        System.out.println("Введіть значення для short: ");
        String shortInput = scanner.nextLine();
        short shortValue = Short.parseShort(shortInput);
        System.out.println("Введене значення short: " + shortValue);

        System.out.println("Введіть значення для int: ");
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println("Введене значення int: " + intValue);

        System.out.println("Введіть значення для long: ");
        String longInput = scanner.nextLine();
        long longValue = Long.parseLong(longInput);
        System.out.println("Введене значення long: " + longValue);

        System.out.println("Введіть значення для float: ");
        String floatInput = scanner.nextLine();
        float floatValue = Float.parseFloat(floatInput);
        System.out.println("Введене значення float: " + floatValue);

        System.out.println("Введіть значення для double: ");
        String doubleInput = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleInput);
        System.out.println("Введене значення double: " + doubleValue);
    }
}
