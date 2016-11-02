package eva.pizza.pv.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by NicoE on 02.11.2016.
 */


@Controller
public class HomepageUC {

    @RequestMapping("/")
    public String getHomepage() {

        return "homepage";

    }

}
