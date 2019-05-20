<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel = "stylesheet" type = "text/css" href = "/css/todo.css"/>
</head>
<body>
<div id="myDIV" class="header">
<h2 style="margin:5px" onClick = "goHome()">My To Do List</h2>
  <form method = "post" action = "/todo/revise">
  <input type="hidden" name="_method" value="put">
  <input type="hidden" name="num" value="${todo.num}">
  <input type="text" id="title" name = "title" value = "${todo.title}" >
  <input type="hidden" name="finish" value="${todo.finish}"> 
  <textarea rows = "5" name = "content" >${todo.content}</textarea>
  <input type = "date" name = "deadline" value = "<fmt:formatDate value="${todo.deadline}" pattern="yyyy-MM-dd"/>">
  <input type = "number" name = "priority" value = "${todo.priority}">
  <input type = "submit" value = "Update" class="addBtn">
  </form>
 <script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript" src="/js/todo.js"></script>
</div>
</body>
</html>

