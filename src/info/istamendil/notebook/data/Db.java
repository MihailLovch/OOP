package info.istamendil.notebook.data;

public interface Db {
  public void save(Object obj) throws DbException;
  public Object[] findAll() throws DbException;
}
