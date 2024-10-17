package Less5;

public class Main {
    public static void main(String[] args) {
        park ();
        user ();

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

    public static void park() {
        Park park = new Park("Park");
        Park.Attraction attractionOne = park.new Attraction("Attraction1", "10:00 - 14:00", 20);
        attractionOne.printInfo();

    }

    public static void user() {
        User user = new User("Ivan", "manager", "poeyavin", "39757", 3000, 24);
        user.info();

    }
}


