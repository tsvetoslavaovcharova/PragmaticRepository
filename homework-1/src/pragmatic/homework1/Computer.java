package pragmatic.homework1;

public class Computer {

    private int year;
    private double price;
    private boolean isNotebook;
    private int hardDiskMemory;
    private int freeMemory;
    private String operationSystem;

    public Computer(int year, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
        setYear(year);
        setNotebook(isNotebook);
        setHardDiskMemory(hardDiskMemory);
        setFreeMemory(freeMemory);
        setOperationSystem(operationSystem);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("The field year must be positive number!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        if (hardDiskMemory >= 0) {
            this.hardDiskMemory = hardDiskMemory;
        } else {
            throw new IllegalArgumentException("The field hardDiskMemory must be positive number!");
        }
    }

    public int getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(int freeMemory) {
        if (freeMemory >= 0) {
            this.freeMemory = freeMemory;
        } else {
            throw new IllegalArgumentException("The field freeMemory must be positive number!");
        }
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
    }


    public void useMemory(double memory) {
        if (memory > this.freeMemory) {
            System.out.println("Not enough free memory");
        } else {
            this.freeMemory -= memory;
        }
    }

    @Override
    public String toString() {
        return "pragmatic.homework1.Computer  " +
                "year:" + year +
                ", isNotebook:" + isNotebook +
                ", hardDiskMemory:" + hardDiskMemory +
                ", freeMemory:" + freeMemory +
                ", operationSystem:" + operationSystem;
    }
}
