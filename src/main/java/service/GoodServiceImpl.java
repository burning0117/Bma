package service;

import dao.GoodDao;
import domain.Good;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Service("goodService")
public class GoodServiceImpl implements GoodService {
    @Resource(name = "goodDao")
    private GoodDao goodDao;

    @Transactional(readOnly = false)
    public void saveGood(Good good) {
        this.goodDao.saveGood(good);
    }

    @Transactional(readOnly = false)
    public void deleteGood(Serializable id, String deleteMode) {
        this.goodDao.deleteGood(id, deleteMode);
    }

    @Transactional(readOnly = false)
    public void updateGood(Good good) {
        this.updateGood(good);
    }

    public Collection<Good> getAllGoods() {
        return this.goodDao.getAllEntry();
    }

    public Good getGoodById(Serializable id) {
        return this.goodDao.getGoodById(id);
    }
}
