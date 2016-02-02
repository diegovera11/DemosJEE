package co.aptcom.aptcore.dao;

import java.util.List;

public interface IGenericDAO {
	
	public <T> T create(T entity);
	
	public <T> T update(T entity);
	
	public <T> List<T> find(T entity);
	
	public <T> void delete(T entity);
	
	public <T> T findById(Class<T> type, Object id);

}
