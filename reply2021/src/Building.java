public class Building implements Comparable<Building>{

    int  latencyP;
    int  speedP;
    int coordinateX;
    int coordinateY;

    Building(int  latencyP, int  speedP, int coordinateX, int coordinateY) {
        this.latencyP = latencyP;
        this.speedP = speedP;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public int compareTo(Building other) {
        return this.speedP - other.speedP;
    }
}
