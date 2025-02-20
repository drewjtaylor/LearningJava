public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Creating monsters with different stats
        Monster dragon = new Monster("Dragon", 200.0, 25.0, 10.0);
        Monster orc = new Monster("Orc", 120.0, 15.0, 5.0);
        Monster skeleton = new Monster("Skeleton", 75.0, 12.0, 3.0);

        // Print stats for each monster
        dragon.printStats();
        orc.printStats();
        skeleton.printStats();
    }
}
