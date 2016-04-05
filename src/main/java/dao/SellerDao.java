package dao;

import domain.Seller;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
public interface SellerDao<T> extends BaseDao<T>{
    public void saveSeller(Seller seller);
    public void deleteSeller(Serializable id,String deleteMode);
    public void updateSeller(Seller seller);
    public Collection<Seller> getAllSeller();
    public Seller getSellerById(Serializable id);
}
