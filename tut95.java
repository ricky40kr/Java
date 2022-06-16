// interfaces

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
}

class tut95 {
    public static void main(String args[]) {
        Rectangle d = new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }
}