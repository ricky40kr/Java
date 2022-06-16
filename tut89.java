// static method in interfaces

interface Drawable {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }

    public int cube(int x) {
        return x * x;
    }
}

class tut89 {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }
}