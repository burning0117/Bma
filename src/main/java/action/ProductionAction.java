package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Production;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.ProductionService;
import utils.DeleteMode;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("productionAction")
@Scope("prototype")
public class ProductionAction extends BaseAction<Production>{
    @Resource(name = "productionService")
    private ProductionService productionService;
    public String getAllProduction(){
        Collection<Production> productionList=this.productionService.getAllProductions();
        ActionContext.getContext().put("productionList",productionList);
        return listAction;
    }
    public String deleteProduction(){
        this.productionService.deleteProduction(this.getModel().getpId(), DeleteMode.DEL_PRE_RELEASE);
        return  action2action;
    }
    public String addUI(){
        return addUI;
    }
    public String add(){
        Production production=new Production();
        BeanUtils.copyProperties(this.getModel(), production);
        this.productionService.saveProduction(production);
        return action2action;
    }
    public String updateUI(){
        Production production=this.productionService.getProductionById(this.getModel().getpId());
        ActionContext.getContext().getValueStack().getRoot().add(0, production);
        return updateUI;
    }
    public String update(){
        Production production=this.productionService.getProductionById(this.getModel().getpId());
        BeanUtils.copyProperties(this.getModel(), production);
        this.productionService.updateProduction(production);
        return action2action;
    }
}
