public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light l) { this.light = l; }
    @Override public void execute() { System.out.println("Executing LightOffCommand"); light.off(); }
}