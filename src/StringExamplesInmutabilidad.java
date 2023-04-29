public class StringExamplesInmutabilidad {
    public static void main(String[] args) {
        String course = "Programación Java";
        String teacher = "Francisco Marín";

        String details = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("teacher = " + teacher);
        System.out.println("details = " + details);

    }
}
