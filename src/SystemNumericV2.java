import javax.swing.*;

public class SystemNumericV2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Ingrese un número");
        int number = 0;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            main(args);
            System.exit(0);
        }

        String binaryResult = "Número "+ number +" a binario es igual a: "+ Integer.toBinaryString(number);
        String octalResult = "Número "+ number + " a octal es igual a: " + Integer.toOctalString(number);
        String hexResult = "Número " + number + " a hexadecimal es igual a: " + Integer.toHexString(number);

        String message = binaryResult + "\n" + octalResult;
        message += "\n" + hexResult;

        JOptionPane.showMessageDialog(null, message);
    }
}
