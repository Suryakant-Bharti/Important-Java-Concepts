package java_design_patterns.gof_behavioral.state;

public class StateDemo {
    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
