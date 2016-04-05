package service;

import dao.ProductionDao;
import domain.Production;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Service("productionService")
public class ProductionServiceImpl implements ProductionService {
    @Resource(name = "productionDao")
    private ProductionDao productionDao;

    @Transactional(readOnly = false)
    public void saveProduction(Production production) {
        this.productionDao.saveProduction(production);
    }

    @Transactional(readOnly = false)
    public void deleteProduction(Serializable id, String deleteMode) {
        this.productionDao.deleteProduction(id, deleteMode);
    }

    @Transactional(readOnly = false)
    public void updateProduction(Production production) {
        this.productionDao.updateProduction(production);
    }

    public Collection<Production> getAllProductions() {
        return this.productionDao.getAllProductions();
    }

    public Production getProductionById(Serializable id) {
        return this.productionDao.getProductionById(id);
    }
}
