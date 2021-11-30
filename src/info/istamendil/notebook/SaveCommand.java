package info.istamendil.notebook;

import info.istamendil.notebook.utils.UserInteractorWriteException;

public class SaveCommand implements Command {
    private final App app;
    public SaveCommand(App app) {
        this.app = app;
    }
    @Override
    public void execute() throws UserInteractorWriteException {
        try {
            app.saveCommand(app.getScanner().nextLine());
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new UserInteractorWriteException("No more space left");
        }
    }
}
