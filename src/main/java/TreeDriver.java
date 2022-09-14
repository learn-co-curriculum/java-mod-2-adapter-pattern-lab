public class TreeDriver {

    public static void main (String[] args) {
        Aspen aspen = new Aspen();
        Pine pine = new Pine();
        Redwood redwood = new Redwood();

        MeterHeight aspenInMeters = new HeightAdapter(aspen);
        System.out.println("The height of an aspen tree in meters is " + aspenInMeters.getHeight());
        MeterHeight pineInMeters = new HeightAdapter(pine);
        System.out.println("The height of an pine tree in meters is " + pineInMeters.getHeight());
        MeterHeight redwoodInMeters = new HeightAdapter(redwood);
        System.out.println("The height of an redwood tree in meters is " + redwoodInMeters.getHeight());
    }
}
