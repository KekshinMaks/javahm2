public class Main {
    public static void main(String[] args) {

        int count1 = 0;
        for (int i = 2; i <= 100; i++)
        {
            if (isPrime(i))
            {
                count1++;
            }
        }


        int count2 = 0;

        for (int i = 100; i <= 500; i++)
        {
            if (isPrime(i))
            {
                count2++;
            }
        }

        // Выводим результат
        System.out.println("Простых чисел от 0 до 100: " + count1);
        System.out.println("Простых чисел от 100 до 500: " + count2);

        if (count1 < count2)
        {
            System.out.println("Во втором диапазоне больше простых на " + (count2 - count1));
        }
        else if (count1 > count2)
        {
            System.out.println("В первом диапазоне больше простых на " + (count1 - count2));
        }
        else
        {
            System.out.println("Одинаковое количество простых чисел");
        }
    }


    static boolean isPrime(int n)
    {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}

