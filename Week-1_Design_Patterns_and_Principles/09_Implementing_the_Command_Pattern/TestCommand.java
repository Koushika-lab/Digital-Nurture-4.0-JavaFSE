public class TestCommand {
    public static void main(String[] args) {
        Light myLight = new Light();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(myLight));
        remote.pressButton();
        System.out.println();

        remote.setCommand(new LightOffCommand(myLight));
        remote.pressButton();
    }
}
