import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre de tu papá: ");
            String father = sc.nextLine();

            System.out.print("Ingrese el nombre de su mamá: ");
            String mother = sc.nextLine();

            System.out.print("Ingrese el nombre de su hermana / hermano: ");
            String bro = sc.nextLine();

            String fatherConverter = father.toUpperCase().charAt(1) + "." + father.substring(father.length() - 2);
            String motherConverter = mother.toUpperCase().charAt(1) + "." + mother.substring(mother.length() - 2);
            String broConverter = bro.toUpperCase().charAt(1) + "." + bro.substring(bro.length() - 2);

            String result = fatherConverter + "_" + motherConverter + "_" + broConverter;
            System.out.println("result = " + result);

        }catch (Exception e) {
            System.out.println("Exception message " + e.getMessage());
        }

    }
}
