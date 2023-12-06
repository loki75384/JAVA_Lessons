// Задание №2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.



public class task4 {
    public static void main(String[] args) {
        int [] array;
        array = new int [7];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
            array [2] = 0;
            if (array[i] == 1){
                count++;
            } else if (array[i] == 0){
                count--;
            }
        }
        System.out.println(count);

    }
}
