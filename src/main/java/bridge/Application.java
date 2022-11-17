package bridge;

import bridge.View.InputView;
import bridge.View.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
        BridgeGame bridgeGame = new BridgeGame();

        BridgeGameController bridgeGameController = new BridgeGameController(inputView,outputView,bridgeMaker,bridgeGame);

        bridgeGameController.run();
    }
}
