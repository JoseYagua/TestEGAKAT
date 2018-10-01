<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test José Yagua</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/home.htm" />">Listado de productos</a></li>
                <li class="active">Editar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Editar</div>
                <div class="panel-body">
                   
                        <form:form method="post" commandName="table">
                            <h1>Complete el formulario</h1>
                            
                            <form:errors path="*" element="div" cssClass="alert alert-danger" />
                            
                            <p>
                                <form:label path="vtable1.id">Ingrese Id *:</form:label>
                                <form:input path="vtable1.id" type="number" cssClass="form-control" />
                            </p>
                            <p>
                                <form:label path="vtable1.a">Ingrese A *:</form:label>
                                <form:input path="vtable1.a" type="number" cssClass="form-control" />
                            </p>
                            
                            <p>
                                <form:label path="vtable1.b">Ingrese B:</form:label>
                                <form:input type="date" path="vtable1.b" cssClass="form-control" />
                            </p>     
                            
                            <p>
                                <form:label path="c">Ingrese C:</form:label>
                                <form:input type="date" path="c" cssClass="form-control" />
                            </p>
                            
                             <p>
                                <form:label path="d">Ingrese D:</form:label>
                                <form:input type="date" path="d" cssClass="form-control" />
                            </p>
                            
                            <hr />
                            <input type="submit" value="Enviar" class="btn btn-danger" />
                        </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
