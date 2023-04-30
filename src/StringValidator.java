public class StringValidator {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if(isNull){
            course = "Welcome to course";
        }

        course = " ";

        //boolean isEmpty = course.length() == 0;
        boolean isEmpty = course.isEmpty();
        boolean isBlank = course.isBlank();

        if (isEmpty || isBlank) {
            System.out.println("Empty");
        } else {
            System.out.println("course = " + course);
            System.out.println(course.concat(" desde cero"));
        }
    }
}

