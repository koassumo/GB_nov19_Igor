package lesson1;

public class Wall {

    private int height;

    public Wall (int height){
        this.height = height;
    }

    public void doing (_Jumper jumper){
        if (jumper.getIsOut() == false)  jumper.doJump(height);

    }
}
