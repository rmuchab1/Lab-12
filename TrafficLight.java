public class TrafficLight {
    public static void Traffics(Lights ls) {
        switch (ls) {
            case RED:
                System.out.println(String.format("%s! It's %s light",
                        ls.colour, ls.name()));
                break;
            case YELLOW:
                System.out.println(String.format("%s! It's %s light",
                        ls.colour, ls.name()));
                break;
            case GREEN:
                System.out.println(String.format("%s! It's %s light",
                        ls.colour, ls.name()));
                break;
            default:
                System.out.println("Traffic lights are out of order,"
                        + "please try again later.");
        }
    }
}
