public class Computer {
    private String CPU;
    private int RAM;
    private int storage;
    private boolean hasGraphicsCard;

    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.hasGraphicsCard = b.hasGraphicsCard;
        System.out.println("Computer built: " + this);
    }

    @Override
    public String toString() {
        return "CPU=" + CPU + ", RAM=" + RAM + "GB, storage=" + storage + "GB, graphics=" + hasGraphicsCard;
    }

    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;
        private boolean hasGraphicsCard;

        public Builder setCPU(String cpu) { 
            this.CPU = cpu; System.out.println("Builder: CPU set to " + cpu); 
            return this; }
        public Builder setRAM(int ram) { 
            this.RAM = ram; System.out.println("Builder: RAM set to " + ram + "GB"); 
            return this; }
        public Builder setStorage(int storage) { 
            this.storage = storage; System.out.println("Builder: storage set to " + storage + "GB"); 
            return this; }
        public Builder setGraphicsCard(boolean has) { 
            this.hasGraphicsCard = has; System.out.println("Builder: graphics card set to " + has); 
            return this; }
        public Computer build() {
            System.out.println("Builder: building Computer...");
            return new Computer(this);
        }
    }
}
