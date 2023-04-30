public class StringExamplesPerformance {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(c);

        long timeInitial = System.currentTimeMillis();

        for (int i = 0; i < 1000 ; i ++) {
            // c = c.concat(a).concat(b).concat("\n");
            // c += a + b + "\n";
            sb.append(a).append(b).append(c).append("\n"); // Ganador
        }

        long timeFinal = System.currentTimeMillis();

        long total = timeFinal - timeInitial;
        System.out.println("c = " + c);
        System.out.println("total = " + total);
        System.out.println("sb = " + sb);
    }
}
