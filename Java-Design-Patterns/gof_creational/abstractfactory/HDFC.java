package Java-Design-Patterns.gof_creational.abstractfactory;

public class HDFC implements Bank {
    String BNAME;

    public HDFC() {
        this.BNAME = "HDFC";
    }

    @Override
    public String getBankName(String bank) {
        return BNAME;
    }
}
