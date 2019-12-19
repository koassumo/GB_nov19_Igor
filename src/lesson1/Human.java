package lesson1;

public class Human implements _Jumper, _Runner{

    private String name;
    private int max_distance;
    private int max_jump;
    private boolean isOut = false;

    public Human(String name, int max_distance, int max_jump) {
        this.name = name;
        this.max_distance = max_distance;
        this.max_jump = max_jump;
    }

    @Override
    public boolean getIsOut (){ return isOut;}

    @Override
    public void doJump(int height) {
        System.out.print("Человек " + name + " (мах прыжок на " + max_jump + " метров) пытается прыгнуть на " + height + " метров... ");
        if (height > max_jump) {
            isOut = true;
            System.out.println("Результат: не прошел препятствие.     Сошел с дистанции !!!!!!!!!!!!!!");
        }
        else {
            System.out.println("Результат: успешно.");
        }

    }

    @Override
    public void doRun(int distance) {
        System.out.print("Человек " + name + " (мах дистанция на " + max_distance + " метров) пытается пробежать " + distance + " метров... ");
        if (distance > max_distance) {
            isOut = true;
            System.out.println("Результат: не прошел препятствие.     Сошел с дистанции !!!!!!!!!!!!!!");
        }
        else {
            System.out.println("Результат: успешно.");
        }
    }

}


