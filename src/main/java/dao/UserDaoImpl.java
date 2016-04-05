package dao;

import domain.User;
import org.springframework.stereotype.Repository;
import utils.DeleteMode;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/3.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao<User>{
    public void saveUser(User user) {
        this.saveEntry(user);
    }

    public void updateUser(User user) {
        this.updateEntry(user);
    }

    public void deleteUserById(Serializable id, String deleteMode) {
        if(deleteMode.equals(DeleteMode.DEL)){
            this.deleteEntry(id);
        }else if(deleteMode.equals(DeleteMode.DEL_PRE_RELEASE)){
            //Set<Good> goods=
        }
    }

    public Collection<User> getAllUser(User user) {
        return this.getAllEntry();
    }

    public User getUserById(Serializable id) {
        return this.getEntryById(id);
    }
}
