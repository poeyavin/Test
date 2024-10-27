package Less10_;

public class Triangle extends Shape implements Calculate {

    private int side1;
    private String side2;
    private String side3;

    public Triangle(String color, String borderColor, int side1, String side2, String side3) {
        super(color, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateSquare() {
        return 0;
    }
}
