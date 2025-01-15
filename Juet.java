public class Juet {
    // Private member variables
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Juet juet = new Juet();
        juet.setName("John Doe");
        juet.setAge(25);

        System.out.println("Name: " + juet.getName());
        System.out.println("Age: " + juet.getAge());
    }
}

