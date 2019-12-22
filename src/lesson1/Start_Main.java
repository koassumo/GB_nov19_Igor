package lesson1;

public class Start_Main {

    public static void main(String[] args) {

        Human human = new Human("Василий", 1000, 1);
        Cat cat = new Cat ("Мурка", 2000, 2);
        Robot robot = new Robot("Wall-e", 5000, 5);

        Wall walls [] = new Wall[3];
        walls[0] = new Wall(1);     walls[1] = new Wall(3);     walls[2] = new Wall(88);

        Track tracks[] = new Track[3];
        tracks[0] = new Track(800);     tracks[1] = new Track(1500);     tracks[2] = new Track(8000);;

        for (int i = 0; i < 3; i++) {
            walls[i].doing (human);
            walls[i].doing (cat);
            walls[i].doing (robot);
            System.out.println("");

            tracks[i].doing (human);
            tracks[i].doing (cat);
            tracks[i].doing (robot);
            System.out.println("");

        }

    }
}
