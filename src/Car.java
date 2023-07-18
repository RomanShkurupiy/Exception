import java.util.ArrayList;
import java.util.EnumSet;

public class Car {
    private String color;
    private String mark;
    private int year;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        ArrayList<String> color2 = new ArrayList<String>();
        color2.add("Black");
        color2.add("White");
        color2.add("Yellow");
        color2.add("Green");

        try {
            if (color2.contains(color)) {
                this.color = color;
            } else throw new invalidColorException("Color is not Black");
        } catch (invalidColorException ignored) {



//        try {
//            if (color.equalsIgnoreCase("Black")) {
//                this.color = color;
//            } else throw new invalidColorException("Color is not black");
//        } catch (invalidColorException ignored) {

        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
         try {
            if (mark.equalsIgnoreCase("mazda")) {
                this.mark = mark;
            } else throw new invalidMarkException("Not Mazda");
        } catch (invalidMarkException ex) {
             System.out.println(ex.getMessage());
         }
    }
    public int getYear() {
         return year;
    }

    public void setYear(int year) {
        if (year < 1885) {
            throw new invalidYearLessException("Wrong year. First car was created in 1885");
        } else if (year > 2023) {
            throw new invalidYearMoreException("Wrong year. You cannot enter future date");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                '}';
    }


enum COLORS {
    BLACK,
    WHITE,
    YELLOW,
    GREEN,
    RED,
    BLUE,
    PURPLE,
    GRAY
    }
}
