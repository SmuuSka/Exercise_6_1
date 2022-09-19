package fi.samu.aikio.exercise_6_1;

public class President {
    private String name, description;
    private int start, stop;

    public President(String name, int startAsPresident, int seasonEnd, String description){
        this.name = name;
        this.start = startAsPresident;
        this.stop = seasonEnd;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getStop() {
        return stop;
    }

    public String getDescription() {
        return description;
    }
}
