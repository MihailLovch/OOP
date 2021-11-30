package info.istamendil.notebook.utils;

public interface UserInteractor {
  public String readCommand() throws UserInteractorReadException ;
  public void print(String output) throws UserInteractorWriteException ;
}
