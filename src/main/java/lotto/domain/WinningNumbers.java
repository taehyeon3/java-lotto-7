package lotto.domain;

import java.util.List;

public class WinningNumbers {
    private final Lotto numbers;
    private int bonusNumber;

    public WinningNumbers(List<Integer> numbers) {
        this.numbers = new Lotto(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers.getNumbers();
    }

    public void setBonusNumber(int number) {
        if (numbers.contains(number)) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호에 중복된 번호가 있습니다.");
        }
        bonusNumber = number;
    }
}
