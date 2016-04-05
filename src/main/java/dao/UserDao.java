package dao;

import domain.User;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/3.
 */
public interface UserDao<T> extends BaseDao<T> {
   public void saveUser(User user);
   public void updateUser(User user);
   public void deleteUserById(Serializable id,String deleteMode);
   public Collection<User> getAllUser(User user);
   public User getUserById(Serializable id);
}
