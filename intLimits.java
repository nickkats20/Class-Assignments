public class intLimits {
    public static void main(String[] args) {
        limits();
    }

    public static void limits() {
        long value = 1;
        for (int i = 0; i < 65; i++) {
            System.out.println("2 to the " + i + " = " + value);
            value = value * 2;
        }
    }

}