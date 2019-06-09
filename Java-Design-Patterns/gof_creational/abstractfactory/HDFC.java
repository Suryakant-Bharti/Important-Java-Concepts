package gof_design_patterns.creational.abstractfactory;

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
