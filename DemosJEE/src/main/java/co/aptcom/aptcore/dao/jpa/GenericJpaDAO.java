package co.aptcom.aptcore.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.aptcom.aptcore.dao.GenericDAO;

public class GenericJpaDAO extends GenericDAO {
	
	@PersistenceContext
	protected EntityManager em;

	@Override
	public <T> T create(T entity) {
	  em.persist(entity);
	  em.flush();
	  em.refresh(entity);
	  return entity;
	}

	@Override
	public <T> T update(T entity) {
		return em.merge(entity);
		   
	}

	@Override
	public <T> List<T> find(T entity) {
		
		return null;
	}

	@Override
	public <T> void delete(T entity) {
		em.remove(entity);
	}

	@Override
	public <T> T findById(Class<T> type, Object id) {
		return (T) em.find(type,id);
	}

}
