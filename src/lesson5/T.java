package lesson5;


public class T implements Runnable   {

    float [] arr;
    int size;

    T(float [] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public float[] getArr (){
        return arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            try {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            } catch (Exception e) {}
        }
    }


}

