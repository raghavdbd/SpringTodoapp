package com.todoapp.todoapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todoapp.todoapp.login.loginController;

@Controller
public class todocontroller {
    private todoservice todoservice ;




    public todocontroller(com.todoapp.todoapp.todo.todoservice todoservice) {
        this.todoservice = todoservice;
    }




    @RequestMapping("todo")
    public String todo(ModelMap model){
        
             List<Todo>todos=todoservice.getlist("Raghav");

             model.addAttribute( "todos",todos);
        
       

        return "todo";
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.GET)
    public String Addtodo(ModelMap model){
        Todo todo=new Todo(0,"Raghav","",LocalDate.now().plusDays(365),false);
        model.put("todo", todo);
        return "addtodo";
    }
     @RequestMapping(value = "add-todo",method = RequestMethod.POST)

     public String addnewtodo(ModelMap model,Todo todo){
// todoservice.addtodo("Raghav", todo.getDescription(), LocalDate.now().plusYears(1), false);
todoservice.addtodo("Raghav", todo.getDescription(), LocalDate.now().plusYears(1), false);

        return "redirect:todo";

        
     }
     @RequestMapping("delete-todo")
     public String Delete(@RequestParam int id){
        todoservice.deletebyid(id);

         return "redirect:todo";


     }
     
    
}
