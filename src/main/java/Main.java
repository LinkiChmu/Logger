import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        System.out.println(logger);

        logger.log("Просим пользователя ввести входные данные для списка");
        int n, m;
        System.out.println("Введите размер списка: ");
        n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        m = scanner.nextInt();

        logger.log("Создаем и наполняем список");
        List<Integer> randomList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(m));
        }
        System.out.print("Вот случайный список: ");
        randomList.forEach(v -> System.out.print(v + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int treshold;
        System.out.println("Введите порог для фильтра: ");
        treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(randomList);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(v -> System.out.print(v + " "));
        System.out.println();

        logger.log("Завершаем программу");

    }
}
