package Less5;

public class User {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public User(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.print("name:" + name + " position: " + position + " e-mail: " + email
                + " Phone: " + phone + " Salary: " + salary + " Age: " + age);
    }

}
