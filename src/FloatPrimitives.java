public class FloatPrimitives {
    public static void main(String[] args) {
        float realFloat = 1.0F;
        System.out.println("realFloat = " + realFloat);

        float realFloatTwo = 20.23F;
        System.out.println("realFloatTwo = " + realFloatTwo);
        
        float realFloatThree = 1.5e4F;
        System.out.println("realFloatThree = " + realFloatThree);

        float realFloatFour = 1.5e-10F;
        System.out.println("realFloatFour = " + realFloatFour);


        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);


        double realDouble = 3.141516;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);

        var floatVar = 3.1416F;
        System.out.println("floatVar = " + floatVar);
        
        var doubleVar = 3.1416;
        System.out.println("doubleVar = " + doubleVar);
    }
}
