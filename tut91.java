// Final Keyword
/*
* It stop value change
* Stop method overriding
* Stop inhertance
*/

class tut91 {
    final int speedlimit = 90;// final variable

    final void run() {
        // speedlimit = 400;
    }

    final class b extends tut91 {
        public static void call() {
            System.out.println("calling...!");
        }
    }

    public static void main(String args[]) {
        tut91 obj = new tut91();
        obj.run();

    }
}