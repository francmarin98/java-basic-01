import javax.swing.*;
import java.util.Scanner;

public class SystemNumericV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("Ingrese un número");
            number = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Debe ingresar un número, no letras");
            main(args);
            System.exit(0);
        }

        String binaryResult = "Número "+ number +" a binario es igual a: "+ Integer.toBinaryString(number);
        String octalResult = "Número "+ number + " a octal es igual a: " + Integer.toOctalString(number);
        String hexResult = "Número " + number + " a hexadecimal es igual a: " + Integer.toHexString(number);

        String message = binaryResult + "\n" + octalResult;
        message += "\n" + hexResult;

        System.out.println(message);
    }
}
