public class CharacterPrimitives {
    public static void main(String[] args) {
        char arroba = '\u0040';
        char decimal = 64;
        System.out.println("arroba = " + arroba);
        System.out.println("decimal = " + decimal);

        System.out.println("(decimal == arroba) = " + (decimal == arroba));

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char backslate = '\b';
        char tabulador = '\t';


        System.out.println("Tipo char corresponde en byte a" + espacio + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor mínimo de un char " + Character.MIN_VALUE);
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("backslate = " + backslate);
        System.out.println("espacioUnicode = " + espacioUnicode);
    }
}
