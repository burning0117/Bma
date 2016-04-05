package action;

import domain.Seller;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("sellerAction")
@Scope("prototype")
public class SellerAction extends BaseAction<Seller> {
}
