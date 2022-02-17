package test7_13.command;

public class Command {
    private String command;
    private String variableName;
    private String value;
    public Command(String command, String variableName, String value){
        this.command = command;
        this.variableName = variableName;
        this.value= value;
    }

    public String getCommand() {
        return command;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getValue() {
        return value;
    }
}
