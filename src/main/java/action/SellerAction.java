package action;

import domain.Seller;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.SellerService;

import javax.annotation.Resource;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("sellerAction")
@Scope("prototype")
public class SellerAction extends BaseAction<Seller> {
    @Resource(name = "sellerService")
    private SellerService sellerService;
}
