package lesson5;

public class Main_Start {
    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 10_000_000;
        float[] fullArray = new float[SIZE];

        int partSize;
        long startTime;
        long resultTime;
        long bestTime = 9999999;
        int bestThreadsNumber = 1;

        for (int numberOfThreads = 1; numberOfThreads <= 16384; numberOfThreads *=2) {                 // в каждом цикле количество создаваемых потоков увеличивается вдвое

            for (float j : fullArray) j = 1;        // заполняем главный массив Единицами перед каждым замером
            System.out.print("Измерение в " + numberOfThreads + " поток(ов) ... ");
            startTime = System.currentTimeMillis();

            partSize = SIZE / numberOfThreads;                                    // определяем количество элементов в каждом куске

            float[][] partArray = new float[numberOfThreads][partSize];           // создаем двумерный массив для разбивки на куски главного массива
            Thread[] thread = new Thread[numberOfThreads];                        // создаем нужное количество потоков (по количеству кусков)
            T[] t = new T[numberOfThreads];                                       // создаем объекты-вычислители для каждого потока

            for (int i = 0; i < numberOfThreads; i++) {                           // каждый кусок главного массива помещаем в свой массив и сразу направляем в свой поток для обработки
                System.arraycopy(fullArray, i * partSize, partArray[i], 0, partSize);
                t[i] = new T(partArray[i], partSize);
                thread[i] = new Thread(t[i]);
                thread[i].start();
            }

            for (int i = 0; i < numberOfThreads; i++) { thread[i].join(); }                           // ждем когда все потоки отработают

            for (int i = 0; i < numberOfThreads; i++) {                           // склеиваем все куски обратно в главный массив
                System.arraycopy(t[i].getArr(), 0, fullArray, i * partSize, partSize);
            }
            resultTime = System.currentTimeMillis() - startTime;      // проверяем время
            System.out.println(resultTime + " ms");
            if (resultTime < bestTime) { bestTime = resultTime; bestThreadsNumber = numberOfThreads;} // при необходимости записываем как лучший результат


//            boolean test = true;              // проверка вычислений в итоговом (склеенном) массиве
//            for (int i = 0; i < SIZE; i++) {
//                if (fullArray[i] != (float)(fullArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2))) {
//                    System.out.println(" Error on " + i);
//                    test = false;
//                    break;
//                }
//            }
//            if (test == true) System.out.println(" Checked");
        }

        System.out.println("\n!!!!! Лучший результат: в " + bestThreadsNumber + " поток(ов), " + bestTime + " ms !!!!!");
    }
}
