package controller;

import model.ClassesEntity;
import model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ClassesService;
import service.KeywordsService;

import java.lang.reflect.Method;
import java.util.Locale;

/**
 * Created by Yevgeni on 05.02.2016.
 */
@Controller
public class MainController {
    @Autowired
    KeywordsService keywordsService;
    @Autowired
    ClassesService classesService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "index";
    }


    @RequestMapping(value = "/getKey", method = RequestMethod.GET)
    public
    @ResponseBody
    Response getCharNum(@RequestParam(value = "text") String key, @RequestParam(value = "action") String action) {

        Response msg = new Response();
        if (key != null) {
            try {
                int id = keywordsService.getClassesId(key.toLowerCase());
                ClassesEntity classesEntity = classesService.getClasses(id);
                Object toggle = Class.forName(classesEntity.getClassname()).newInstance();
                if (action.equalsIgnoreCase("on")) {

                    Method method = toggle.getClass().getMethod("getOn");
                    msg.setText((String) method.invoke(toggle));
                    msg.setCount(action);
                }
                if (action.equalsIgnoreCase("off")) {
                    Method method = toggle.getClass().getMethod("getOff");
                    msg.setText((String) method.invoke(toggle));
                    msg.setCount(action);
                }
            } catch (Exception e) {

            }
        }

        return msg;

    }
}
