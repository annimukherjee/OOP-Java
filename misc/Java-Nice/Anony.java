interface K {
    void show();
}

public class Anony {

    public static void main(String[] args) {
        K k = new K() {
            public void show() {
                System.out.println("KIIT");
            }
        };

        k.show();
    }

}
