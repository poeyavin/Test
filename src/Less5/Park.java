package Less5;

public class Park {
    private String name;
    public Park(String name /*String location*/) {
        this.name = name;
    }
    public class Attraction {
        private String attractionName;
        private String workTime;
        private double cost;
        public Attraction(String attractionName, String workTime, double cost) {
            this.attractionName = attractionName;
            this.workTime = workTime;
            this.cost = cost;
        }
        public void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workTime);
            System.out.println("Cost: " + cost + " Руб");
        }
    }
    //public static void main(String[] args) {
     //   Park park = new Park("Park");
      //  Attraction attractionOne = park.new Attraction("Attraction1", "10:00 - 14:00", 20);
       // attractionOne.printInfo();
}


