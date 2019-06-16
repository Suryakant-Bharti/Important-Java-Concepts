package java_design_patterns.gof_creational.abstractfactory;

public class ICICI implements Bank {
    String BNAME;

    public ICICI() {
        this.BNAME = "ICICI";
    }

    @Override
    public String getBankName(String bank) {
        return BNAME;
    }
}
