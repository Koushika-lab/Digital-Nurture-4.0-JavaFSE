public class RemoteControl {
    private Command command;
    public void setCommand(Command c) { this.command = c; }
    public void pressButton() {
        System.out.println("RemoteControl: button pressed");
        command.execute();
    }
}
