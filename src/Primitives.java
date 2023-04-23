public class Primitives {
    public static void main(String[] args) {
        byte numberOne = 127;
        System.out.println("numberOne = " + numberOne);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);


        short numberTwo = 32767;
        System.out.println("numberTwo = " + numberTwo);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);


        int numberThree = 2147483647;
        System.out.println("numberThree = " + numberThree);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);


        long numberFour = 9223372036854775807L;
        System.out.println("numberFour = " + numberFour);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
    }
}
