<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="/eshop/bootstrap-4.3.1-dist/css/bootstrap.min.css" rel="stylesheet">
<title>Exam</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Exams</h1>
				
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">

			<c:forEach items="${exams}" var="exam">
			
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
						<h3>${exam.egzamino_pavadinimas}</h3>
						
						
					</div>
				</div>
				
			</c:forEach>
			
		</div>
	</section>

</body>
</html>