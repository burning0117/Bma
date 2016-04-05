package dao;

import domain.Good;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/3.
 */
public interface GoodDao<T> extends BaseDao<T>{
    public void saveGood(Good good);
    public void deleteGood(Serializable id,String deleteMode);
    public void updateGood(Good good);
    public Collection<Good> getAllGoods();
    public Good getGoodById(Serializable id);
}
