public class student {
    private int age;
    private String name;

    public int getName() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("Sorry! you are too old for being student in our school.");
        } else {
            this.age = age;
        }
    }
}
