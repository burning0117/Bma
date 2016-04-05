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
public class GoodDaoImpl extends BaseDaoImpl<Good> implements GoodDao<Good>{
    public void saveGood(Good good) {
        this.saveEntry(good);
    }

    public void deleteGood(Serializable id, String deleteMode) {
        Good good=this.getGoodById(id);
        if (DeleteMode.DEL.equals(deleteMode)){
            this.deleteEntry(id);
        }else if(deleteMode.equals(DeleteMode.DEL_PRE_RELEASE)){
            //TODO
        }
    }

    public void updateGood(Good good) {
        this.updateEntry(good);
    }

    public Collection<Good> getAllGoods() {
        return this.getAllEntry();
    }

    public Good getGoodById(Serializable id) {
        return this.getEntryById(id);
    }

}
