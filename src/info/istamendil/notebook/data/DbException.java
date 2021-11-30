package info.istamendil.notebook.data;

/**
 * General DB exception.
 */
public class DbException extends Exception {

  public DbException() {}

  public DbException(String msg) {
    super(msg);
  }
}
