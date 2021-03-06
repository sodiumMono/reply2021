public class Anten implements Comparable<Anten>{

    int range;
    int  speed;
    int x;
    int y;
    Anten(int range, int  speed) {
        this.range = range;
        this.speed = speed;
    }
    public void setCoord(int x , int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Anten other = (Anten) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public int compareTo(Anten other) {
         return this.speed-other.speed;
    }
}
