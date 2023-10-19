package com.todoapp.todoapp.todo;




import java.time.LocalDate;

public class Todo {
    private int id;
    private String UserName;
    private String Description;
    private  LocalDate Date;
    private Boolean done;
    public Todo(int id, String userName, String description, LocalDate date, Boolean done) {
        this.id = id;
        UserName = userName;
        Description = description;
        Date = date;
        this.done = done;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public LocalDate getDate() {
        return Date;
    }
    public void setDate(LocalDate date) {
        Date = date;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    @Override
    public String toString() {
        return "todo [id=" + id + ", UserName=" + UserName + ", Description=" + Description + ", Date=" + Date
                + ", done=" + done + "]";
    }
    
    


    
}
