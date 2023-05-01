public class MethodStringArray {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] trabalenguasArray = trabalenguas.toCharArray();
        for (int i = 0; i < trabalenguasArray.length; i++) {
            System.out.println(trabalenguasArray[i]);
        }

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arrayTwo = trabalenguas.split("a");

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("arrayTwo[i] = " + arrayTwo[i]);
        }

        String file = "my_file.png";
        String[] fileArr = file.split("\\.");

        for (int i = 0; i < fileArr.length; i++) {
            System.out.println("fileArr[i] = " + fileArr[i]);
        }

        System.out.println("fileArr[fileArr.length - 1] = " + fileArr[fileArr.length - 1]);

    }
}
