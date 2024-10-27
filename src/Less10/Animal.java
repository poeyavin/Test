package Less10;

public class Animal {
        protected String name;
        protected static int animalCount = 0;

        public Animal(String name) {
            this.name = name;
            animalCount++; //Счетчик животных
        }

    //Метод для бега
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    //Метод для плавания
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}