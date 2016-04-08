package dao;

import domain.Good;
import org.springframework.stereotype.Repository;
import utils.DeleteMode;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/3.
 */
@Repository("goodDao")
public class GoodDaoImpl extends BaseDaoImpl<Good> implements GoodDao<Good> {
}

