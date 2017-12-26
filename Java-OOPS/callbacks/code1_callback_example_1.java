interface CallBack {
    void methodToCallBack();
}

class CallBackImpl implements CallBack {
    public void methodToCallBack() {
        System.out.println("I've been called back");
    }
}

public class Caller {

    public void register(CallBack cb) {
        cb.methodToCallBack();
    }

    public static void main(String[] args) {
        Caller c = new Caller();
        CallBack cb = new CallBackImpl();
        c.register(cb);
    }
} 