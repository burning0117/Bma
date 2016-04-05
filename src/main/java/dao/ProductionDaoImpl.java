package dao;

import domain.Production;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Repository("productionDao")
public class ProductionDaoImpl extends BaseDaoImpl<Production> implements ProductionDao<Production>{
    public void saveProduction(Production production) {
        this.saveEntry(production);
    }

    public void deleteProduction(Serializable id, String deleteMode) {

    }

    public void updateProduction(Production production) {
        this.updateEntry(production);
    }

    public Collection<Production> getAllProductions() {
        return this.getAllEntry();
    }

    public Production getProductionById(Serializable id) {
        return this.getEntryById(id);
    }
}
