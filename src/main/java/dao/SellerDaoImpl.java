package dao;

import domain.Seller;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Repository("sellerDao")
public class SellerDaoImpl extends BaseDaoImpl<Seller> implements SellerDao<Seller>{
    public void saveSeller(Seller seller) {
       this.saveEntry(seller);
    }

    public void deleteSeller(Serializable id, String deleteMode) {

    }

    public void updateSeller(Seller seller) {
        this.updateEntry(seller);
    }

    public Collection<Seller> getAllSeller() {
        return this.getAllEntry();
    }

    public Seller getSellerById(Serializable id) {
        return this.getEntryById(id);
    }
}
