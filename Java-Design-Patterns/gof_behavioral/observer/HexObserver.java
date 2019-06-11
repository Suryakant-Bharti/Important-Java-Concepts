package Java-Design-Patterns.gof_behavioral.observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
