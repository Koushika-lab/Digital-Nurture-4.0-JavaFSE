public class TestBuilder {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM(32)
            .setStorage(2000)
            .setGraphicsCard(true)
            .build();

        System.out.println();

        Computer officePC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM(16)
            .setStorage(512)
            .setGraphicsCard(false)
            .build();
    }
}
