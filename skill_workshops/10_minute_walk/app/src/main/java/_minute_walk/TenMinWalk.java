package _minute_walk;

public class TenMinWalk {
    public Boolean ten_minute_walk(String[] walk) {
        int northSouth = 0;
        int eastWest = 0;
        for (String s : walk) {
            if (s.equals("N")) northSouth++;
            if (s.equals("S")) northSouth--;
            if (s.equals("E")) eastWest++;
            if (s.equals("W")) eastWest--;
        }
        return (northSouth - eastWest) == 0 && walk.length == 10;
    }
}
