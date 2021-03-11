import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("input.in");
        int buildingCount = 0;
        int antenaCount = 0;
        int w;
        int h;
        double revard = 0;
        Scanner scanner = new Scanner(file);

        w = scanner.nextInt();
        h = scanner.nextInt();
        buildingCount = scanner.nextInt();
        antenaCount = scanner.nextInt();
        revard = scanner.nextInt();
        ArrayList<Building> buildings = new ArrayList<>();
        for (int i = 0; i < buildingCount; i++) {
            int x;
            int y;
            int l;
            int s;
            x = scanner.nextInt();
            y = scanner.nextInt();
            l = scanner.nextInt();
            s = scanner.nextInt();
            Building building = new Building(l, s, x, y);
            buildings.add(building);

        }
        ArrayList<Anten> antens = new ArrayList<>();
        for (int i = 0; i < buildingCount; i++) {
            int r;

            int s;

            r = scanner.nextInt();
            s = scanner.nextInt();
            Anten anten = new Anten(r, s);
            antens.add(anten);

        }






        
        scanner.close();
    }
}
