// nested interface

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class tut90 implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new tut90();// upcasting here
        message.msg();
    }
}