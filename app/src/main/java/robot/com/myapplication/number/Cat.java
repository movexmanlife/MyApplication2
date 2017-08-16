package robot.com.myapplication.number;

/**
 * Created by win10 on 2017/7/14.
 */

public class Cat extends Animal {
    private String tall;
    private String color = "red";

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
