package service;

import dao.SellerDao;
import domain.Seller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Service("sellerService")
public class SellerSerivceImpl implements SellerService {
    @Resource(name = "sellerDao")
    private SellerDao sellerDao;
    @Transactional(readOnly = false)
    public void saveSeller(Seller seller) {
        this.sellerDao.saveSeller(seller);
    }
    @Transactional(readOnly = false)
    public void deleteSeller(Serializable id, String deleteMode) {
        this.sellerDao.deleteSeller(id, deleteMode);
    }
    @Transactional(readOnly = false)
    public void updateSeller(Seller seller) {
        this.sellerDao.updateSeller(seller);
    }

    public Collection<Seller> getAllSeller() {
        return this.sellerDao.getAllSeller();
    }

    public Seller getSellerById(Serializable id) {
        return this.sellerDao.getSellerById(id);
    }
}
