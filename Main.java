enum Lights {
    RED("Stop"), YELLOW("Ready"), GREEN("Go");

    String colour;

    Lights(String colour) {
        this.colour = colour;
    }
}
public class Main {
    public static void main(String[] args) {
        Lights ls = Lights.RED;
        TrafficLight.Traffics(ls);
    }
}
