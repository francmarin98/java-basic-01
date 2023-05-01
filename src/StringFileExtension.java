public class StringFileExtension {
    public static void main(String[] args) {
        String fileName = "hello-world.pdf";
        int fileNameIndexOf = fileName.lastIndexOf(".");
        System.out.println("fileName.length() = " + fileName.length());
        System.out.println("fileName.substring(fileNameIndexOf + 1) = " + fileName.substring(fileNameIndexOf + 1));
        
        
        
    }
}
