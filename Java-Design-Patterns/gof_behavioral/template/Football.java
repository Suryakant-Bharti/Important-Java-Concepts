package Java-Design-Patterns.gof_behavioral.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
