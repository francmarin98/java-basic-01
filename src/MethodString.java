public class MethodString {
    public static void main(String[] args) {
        
        String name = "Francisco";


        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Francisco\") = " + name.equals("Francisco"));
        System.out.println("name.equalsIgnoreCase(\"francisco\") = " + name.equalsIgnoreCase("francisco"));
        System.out.println("name.compareTo(\"Francisco\") = " + name.compareTo("Francisco"));
        System.out.println("name.compareTo(\"Joel\") = " + name.compareTo("Joel"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(name.length() -1) = " + name.charAt(name.length() -1));
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(0,5) = " + name.substring(0,5));


    }
}
