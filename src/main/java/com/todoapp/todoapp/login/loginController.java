package com.todoapp.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {


    @RequestMapping(value = "Login",method = RequestMethod.GET)
    public String login()
{

return "login";

}    
 /**
 * @param String
 * @return
 */
@RequestMapping(value = "Login",method = RequestMethod.POST)
    public String Welcome(){
        
    return "welcome";
    }



}    



