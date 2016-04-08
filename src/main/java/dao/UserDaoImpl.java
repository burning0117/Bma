package dao;

import domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lily on 2016/4/3.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao<User>{

}
