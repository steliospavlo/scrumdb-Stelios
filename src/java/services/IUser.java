
package services;

import entities.User;
import models.Result;


public interface IUser {
    
    // Save User to db
    boolean saveUser(User user);
    
    // Get result from db
    Result getResult(User user);
}
