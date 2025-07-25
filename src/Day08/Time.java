package Day08;

public class Time {
    private long time;
    public Time(long time) {
        this.time = time;
        System.out.println(time);
    }

    public Time() {
        this(System.currentTimeMillis());
    }
}
