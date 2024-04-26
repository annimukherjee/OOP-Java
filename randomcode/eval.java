public class eval {

    public static void main(String[] args) {

        try {

            throw new NullPointerException();

        } catch (NullPointerException e) {
            System.out.println("NullPointerException Occured: " + e);
        }
    }
}
