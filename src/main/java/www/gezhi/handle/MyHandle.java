package www.gezhi.handle;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class MyHandle implements Controller {


    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        List list =new ArrayList();
        list.add("aaaaa");
        list.add("bbbbb");
        ModelAndView mvc=new ModelAndView();
        mvc.addObject("lists",list);
        mvc.setViewName("show");
        return mvc;
    }
}
