abstract class Figure {
    abstract void display();
}

class Rectangle extends Figure {
    @Override
    void display() {
        System.out.println("Hello world, i am a rectanlge");
    }
}

class Square extends Figure {
    @Override
    void display() {
        System.out.println("Hello world I am square");
    }
}

class Test_DMD {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        
        Figure f;

        f = r;

        f.display();
    }
}