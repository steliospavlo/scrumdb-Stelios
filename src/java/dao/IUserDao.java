
package dao;

import entities.User;
import models.Result;


public interface IUserDao {
    // Save User to db
    boolean saveUser(User user);
    
    // Get result from db
    Result getResult(User user);
}
