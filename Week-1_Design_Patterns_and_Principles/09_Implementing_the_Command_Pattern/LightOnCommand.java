public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light l) { this.light = l; }
    @Override public void execute() { System.out.println("Executing LightOnCommand"); light.on(); }
}


