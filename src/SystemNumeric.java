public class SystemNumeric {
    public static void main(String[] args) {
        int numeroEntero = 24;
        System.out.println("numeroEntero = " + numeroEntero);

        System.out.println("numeroEntero " + numeroEntero + " a binario es = " + Integer.toBinaryString(numeroEntero));
        int numeroBinario = 0b11000;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numeroEntero " + numeroEntero + " a octal = " + Integer.toOctalString(numeroEntero));
        int numeroOctal = 030;
        System.out.println("numeroOctal " + Integer.toOctalString(numeroEntero)  + " = " + numeroOctal);

        System.out.println("numeroEnteo "+ numeroEntero +" a hexadecimal = " + Integer.toHexString(numeroEntero));
        int numeroHex = 0x18;
        System.out.println("numeroHex "+ Integer.toHexString(numeroEntero) +" = " + numeroHex);
    }
}
