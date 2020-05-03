
package services;

import entities.User;
import models.Result;


public class UserImpl implements IUser{
    private dao.UserDaoImpl userDao;
    
    // Save User to db
    @Override
    public boolean saveUser(User user){
        return userDao.saveUser(user);
    }

    @Override
    public Result getResult(User user) {
        return userDao.getResult(user);
    }
    
}
