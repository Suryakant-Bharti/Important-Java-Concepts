package more_creational.objectpool;

public class ExportingProcess {
    private long processNumber;

    public ExportingProcess(long processNumber) {
        this.processNumber = processNumber;
        System.out.println("Object with process no." + processNumber + " created");
    }

    public long getProcessNumber() {
        return processNumber;
    }
}
