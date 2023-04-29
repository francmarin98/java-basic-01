public class ConversionDeTipos {
    public static void main(String[] args) {
        var numeroStr = "50";

        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "9876.45e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);


        var logicStr = "TRuE";
        var logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        int otroNumero = 100;
        System.out.println("otroNumero = " + otroNumero);

        String otroNumeroStr = Integer.toString(otroNumero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroStr);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        String otroRealStr = Double.toString(realDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 10000;
        short s = (short) i;
        long l = i;

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("s = " + s);
    }
}
