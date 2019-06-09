package gof_design_patterns.creational.abstractfactory;

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
