package action;

import domain.Production;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("productionAction")
@Scope("prototype")
public class ProductionAction extends BaseAction<Production>{
}
