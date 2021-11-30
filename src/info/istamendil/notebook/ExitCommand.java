package info.istamendil.notebook;

public class ExitCommand implements Command{
    @Override
    public void execute(){
        System.out.println("Program has been closed");
        System.exit(0);
    }
}
