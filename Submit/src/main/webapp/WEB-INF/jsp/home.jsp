<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel = "stylesheet" type = "text/css" href = "/css/todo.css"/>
</head>
<body>
<div id="myDIV" class="header">
<h2 style="margin:5px" onClick = "goHome()">My To Do List</h2>
  <form method = "post" action = "todo">
  <input type="text" id="title" name = "title" placeholder="Title...">
  <textarea rows = "5" name = "content" placeholder="Content..."></textarea>
  <input type = "date" name = "deadline" placeholder="Deadline...">
  <input type = "number" name = "priority" placeholder = "Priority...(default 100)">
  <input type = "submit" value = "Add" class="addBtn">
  </form>
</div>
  <c:set var="now" value="<%=new java.util.Date()%>" />
<ul id="myUL">
  <c:forEach items="${list}" var="todo">
  <li><p onClick = "detail('${todo.num}')">
  ${todo.title}
  <c:if test = "${todo.finish eq 1}">(FINISH)</c:if>
  <c:if test = "${todo.deadline < now}"><span style = "color:red;font-weight:bold">PASSED</span></c:if>
  </p><span class = "close" onClick = "deletes('${todo.num}')">x</span></li>
  </c:forEach>
</ul>
<script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript" src="/js/todo.js"></script>
</body>
</html>

