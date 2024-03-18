package Flyweigth;

public class Main {

    public static void main(String[] args) {
        LinesFactory linesFactory = new LinesFactory();

        ILightLine line1 = linesFactory.getLine("red");
        ILightLine line2 = linesFactory.getLine("blue");
        ILightLine line3 = linesFactory.getLine("yellow");

        line1.draw(400,200);
        line2.draw(200,300);
        line3.draw(300,400);

    }
}
