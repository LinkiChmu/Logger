import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        result = source.stream()
                .peek(value -> {
                    if (value >= treshold) {
                        logger.log("Элемент \"" + value + "\" не проходит");
                    } else {
                        logger.log("Элемент \"" + value + "\" проходит");
                    }
                })
                .filter(value -> value < treshold)
                .collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
