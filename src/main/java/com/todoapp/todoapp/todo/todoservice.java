package com.todoapp.todoapp.todo;




import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
@Service
public class todoservice {
    private static  List<Todo>todos =new ArrayList<>();
    private static int todocount=0;

    static{

        todos.add(new Todo(++todocount,"raghav","LearnAWs",LocalDate.now().plusYears(1),true));
         todos.add(new Todo(++todocount,"raghav","LearnAWs",LocalDate.now().plusYears(1),true));
          todos.add(new Todo(++todocount,"raghav","LearnAWs",LocalDate.now().plusYears(1),true));
           todos.add(new Todo(++todocount,"raghav","LearnAWs",LocalDate.now().plusYears(1),true));
            todos.add(new Todo(++todocount,"raghav","LearnAWs",LocalDate.now().plusYears(1),true));
    }
    public List<Todo> getlist(String UserName){
        return todos;
    }

    public void addtodo(String Username,String Description,LocalDate date,boolean done){
  Todo todo=new Todo(++todocount,Username,Description,date,done);
  todos.add(todo);
    }

    /**
    
     */
    public void deletebyid(int id){
        Predicate<? super Todo>predicate = todo -> todo.getId() ==id ;
        todos.removeIf(predicate);
    }
 
    
}
