package pragmatic.homework1;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer computer1 = new Computer(2019, true, 500, 200, "Windows7");
        Computer computer2 = new Computer(2020, false, 300, 100, "Windows10");

        computer1.useMemory(100);
        computer2.changeOperationSystem("Windows10");

        System.out.println(computer1);
        System.out.println(computer2);

    }
}
