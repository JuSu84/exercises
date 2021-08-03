package cwicz61do90.cwicz62;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;

    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> lottoResult;

    public Lotto() {
        generate();
        randomize();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    public void generate() {
        for (int i = 1; i <= NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    public void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, 6);
    }

    public int checkResult(List<Integer> usersNumbers) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
        if (lottoResult.contains(usersNumbers.get(i)))
            found++;
        }
        return found;
    }

}
