
class Osds {

    int x, y;

    Osds() {

    }

    Osds(int x, int y) {

    }

    public void display() {
        System.out.println("x: " + x + "\ny: " + y);
    }
}

class EmptClass9090 {
    public static void main(String[] args) {

        Osds obj = new Osds();

        obj.display();

        Osds obj2 = new Osds(10, 20);

        obj2.display();

    }
}
