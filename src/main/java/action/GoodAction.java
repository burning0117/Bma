package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Good;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.GoodService;
import utils.DeleteMode;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("goodAction")
@Scope("prototype")
public class GoodAction extends BaseAction<Good>{
   @Resource(name = "goodService")
   private GoodService goodService;
   public String getAllGood(){
      Collection<Good> goodList=this.goodService.getAllGoods();
      ActionContext.getContext().put("goodList",goodList);
      return listAction;
   }
   public String deleteGood(){
      this.goodService.deleteGood(this.getModel().getgId(), DeleteMode.DEL_PRE_RELEASE);
      return action2action;
   }
   public String addUI(){
      return addUI;
   }
   public String add(){
      Good good=new Good();
      BeanUtils.copyProperties(this.getModel(),good);
      this.goodService.saveGood(good);
      return action2action;
   }
   public String updateUI(){
      Good good=this.goodService.getGoodById(this.getModel().getgId());
      ActionContext.getContext().getValueStack().getRoot().add(0, good);
      return updateUI;
   }
   public String update(){
      Good good=this.goodService.getGoodById(this.getModel().getgId());
      BeanUtils.copyProperties(this.getModel(),good);
      this.goodService.updateGood(good);
      return action2action;
   }
}
