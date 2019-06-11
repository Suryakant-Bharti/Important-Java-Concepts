package Java-Design-Patterns.gof_behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
