package info.istamendil.notebook;

import info.istamendil.notebook.utils.UserInteractorWriteException;

public interface Command {
    void execute() throws UserInteractorWriteException;
}
