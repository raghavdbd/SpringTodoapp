<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
    
        <form:form action="" method="post" modelAttribute="todo" >
            Description : <form:input type="text" path="description" id="" />
            <form:input type="hidden" path="id" id="" />
            <input type="submit" name="Add" id="" class="btn btn-success" />
        </form:form>


    </div>
    <script src="webjars/bootstrap/5.1.3/css/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
</body>
</html>