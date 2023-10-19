<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
   
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
   <div class="container">

   
    <h1>Todo-List</h1>
    <table class="table">
        <thead>
            <tr>

                <th>ID</th>
                <th>UserName</th>
                <th>Description</th>
                <th>date</th>
    
                <th>IsDone</th>
            </tr>
           
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.userName}</td>
                    <td>${todo.description}</td>
                    <td>${todo.date}</td>
                    
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete${todo.id}</a></td>
                    <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                </tr>

            </c:forEach>

        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
    <script src="webjars/bootstrap/5.1.3/css/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
</body>
</html>