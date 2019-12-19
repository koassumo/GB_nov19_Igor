package lesson1;

public class Track {

    private int distance;

    public Track (int distance){
        this.distance = distance;
    }

    public void doing (_Runner runner){
       if (runner.getIsOut()== false) runner.doRun(distance);
    }

}
