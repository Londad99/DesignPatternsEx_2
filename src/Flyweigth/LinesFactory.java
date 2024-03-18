package Flyweigth;

import java.util.ArrayList;
import java.util.List;

public class LinesFactory {

    private List<ILightLine> lines;

    public LinesFactory(){
        this.lines = lines = new ArrayList<ILightLine>();
    }

    public ILightLine getLine(String color){
        for (ILightLine line : lines) {
            if(line.getColor().equals(color)){
                System.out.println("Returning cached " + color + " line");
                return line;
            }
        }
        System.out.println("Creating a new " + color + " line");
        ILightLine newLine = new Line(color);
        lines.add(newLine);
        return newLine;
    }

}
