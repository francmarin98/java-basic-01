public class StringExamplesConcatenation {
    public static void main(String[] args) {
        String course = "Programación Java";
        String teacher = "Francisco Marín";

        String details = "El curso: " + course + " " + "es impartido por: " +teacher + "\t";
        System.out.println("details = " + details);


        int numberA = 10;
        int numberB = 20;
        System.out.println(details + numberA + numberB);
        System.out.println(details + (numberA + numberB));

        String otherString = course.concat(" - " + teacher);
        System.out.println("otherString = " + otherString);


    }
}
