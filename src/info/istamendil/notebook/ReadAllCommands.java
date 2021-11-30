package info.istamendil.notebook;

import java.util.Arrays;

public class ReadAllCommands implements Command{
    private final App app;
    public ReadAllCommands(App app){
        this.app = app;
    }
    @Override
    public void execute(){
        System.out.println(Arrays.toString(app.getNotes()));
    }
}
