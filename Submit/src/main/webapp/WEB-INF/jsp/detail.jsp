<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/css/todo.css" />
</head>
<body>
	<div id="myDIV" class="header">
		<h2 style="margin: 5px" onClick="goHome()">
			My To DoList
		</h2>
		<input type="text" id="title" name="title" value="${todo.title}" readOnly>
		<textarea rows="5" name="content" readOnly>${todo.content}</textarea>
		<c:if test="${not empty todo.deadline}">
			<input type="text" name="deadline"
				value="<fmt:formatDate value="${todo.deadline}" pattern="yyyy-MM-dd"/>">
		</c:if>
		<c:if test="${todo.priority ne 100}">
			<input type="number" name="priority" value="${todo.priority}"
				readOnly>
		</c:if>
		<input type="hidden" id="finish" value="${todo.finish}"> 
		<input type="button" onclick="goUpdate('${todo.num}')" value="Update" class="addBtn"> 
			<input type="button" onclick="finish('${todo.num}')" value="Complete" class="addBtn">
		<script type="text/javascript" src="/js/jquery.js" charset="UTF-8"></script>
		<script type="text/javascript" src="/js/todo.js" charset="UTF-8"></script>
	</div>
</body>
</html>

