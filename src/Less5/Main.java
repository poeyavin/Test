package Less5;

public class Main {
    public static void main(String[] args) {
        User[] array = new User[6];
        User user = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);
        User user1 = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);
        User user2 = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);
        User user3 = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);
        User user4 = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);

        array[0] = user;
        array[1] = user1;
        array[2] = user2;
        array[3] = user3;
        array[5] = user4;

    }
}
