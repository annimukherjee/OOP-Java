// 1. Aim of the program 
// Write a class file - box with three data members(length, width,
// height) and a method volumel) . Also implement the application class Demo where
// an object of the box class is created with user entered dimensions and volume is printed.
// Input: length, width and height.
// Output: Volume



class Box
{
    double length;
    double width;
    double height;

    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    public void volume()
    {
        System.out.println("Volume: of the box" + length*width*height);
    }

}

