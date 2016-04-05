package action;

import domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by lily on 2016/4/5.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User>{
}
