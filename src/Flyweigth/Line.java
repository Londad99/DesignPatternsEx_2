package Flyweigth;

public class Line implements ILightLine{

    private String color;

    public Line(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " line at " + x + ", " + y);
    }

}
