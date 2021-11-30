package info.istamendil.notebook;

import info.istamendil.notebook.utils.UserInteractorWriteException;

/**
 *
 * Application base.
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 * 
 * Code for studying purposes. Programming course. Kazan Federal University, ITIS.
 * http://study.istamendil.info/
 */
public abstract class Application {
  public abstract void start() throws UserInteractorWriteException;
  public abstract void init();
}