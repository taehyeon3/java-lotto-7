package lotto.domain;

import java.util.List;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoMachine {
    private final InputView inputView;
    private final OutputView outputView;
    private final LottoGenerator lottoGenerator;

    public LottoMachine(InputView inputView, OutputView outputView, LottoGenerator lottoGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lottoGenerator = lottoGenerator;
    }

    public void run() {
        final PurchaseAmount purchaseAmount = inputPurchaseAmount();
        final Lottos lottos = lottoGenerator.generateLottos(purchaseAmount.getQuantity());
        outputView.printLottos(lottos.get());
    }

    private PurchaseAmount inputPurchaseAmount() {
        while (true) {
            try {
                return inputView.readPurchaseAmount();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}