import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        final File file = new File("input.in");
        int buildingCount = 0;
        int antenaCount = 0;
        int w;
        int h;
        double revard = 0;
        final Scanner scanner = new Scanner(file);

        w = scanner.nextInt();
        h = scanner.nextInt();
        buildingCount = scanner.nextInt();
        antenaCount = scanner.nextInt();
        revard = scanner.nextInt();
        final ArrayList<Building> buildings = new ArrayList<>();
        for (int i = 0; i < buildingCount; i++) {
            int x;
            int y;
            int l;
            int s;
            x = scanner.nextInt();
            y = scanner.nextInt();
            l = scanner.nextInt();
            s = scanner.nextInt();
            final Building building = new Building(l, s, x, y);
            buildings.add(building);

        }
        final ArrayList<Anten> antens = new ArrayList<>();
        for (int i = 0; i < antenaCount; i++) {
            int r;

            int s;

            r = scanner.nextInt();
            s = scanner.nextInt();
            final Anten anten = new Anten(r, s);
            antens.add(anten);

        }

        scanner.close();
    }

    public int distance(final int x1, final int y1, final int x2, final int y2) {
        final int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distance;
    }

    public int score(Building b, Anten a) {
        int distance = distance(a.x, b.coordinateY, a.y, b.coordinateY);
        if (distance > a.range)
            return 0;
        else
            return b.speedP * a.speed - b.latencyP * distance;
    }
}
