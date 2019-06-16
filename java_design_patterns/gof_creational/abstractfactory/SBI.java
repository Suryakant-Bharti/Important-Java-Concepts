package java_design_patterns.gof_creational.abstractfactory;

public class SBI implements Bank {
    String BNAME;

    public SBI() {
        this.BNAME = "SBI";
    }

    @Override
    public String getBankName(String bank) {
        return BNAME;
    }
}
