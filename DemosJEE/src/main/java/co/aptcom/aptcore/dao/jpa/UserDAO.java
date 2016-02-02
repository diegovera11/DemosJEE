package co.aptcom.aptcore.dao.jpa;

import java.util.List;

import co.aptcom.aptcore.dao.IUserDAO;
import co.aptcom.aptcore.entity.User;

public class UserDAO extends GenericJpaDAO implements IUserDAO{
    public List<User> findUserByName(){
		return null;
    	
    }
}
