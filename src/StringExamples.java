public class StringExamples {
    public static void main(String[] args) {
        String cursoOne = "Programación Java";
        String cursoTwo = new String("Programación java");

        boolean isEquals = cursoOne == cursoTwo;
        System.out.println("isEquals using == " + isEquals);

        isEquals = cursoOne.equals(cursoTwo);
        System.out.println("isEquals using equals " + isEquals);

        isEquals = cursoOne.equalsIgnoreCase(cursoTwo);
        System.out.println("isEquals using equalsIgnoreCase " + isEquals);

        String cursoThree = "Programación Java";
        isEquals = cursoOne == cursoThree;
        System.out.println("isEquals = " + isEquals);


    }
}
