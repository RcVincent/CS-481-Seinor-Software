<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<title>CTM mkii - Employee Profile </title>
	<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h1> Employee Profile </h1>
<p class="note">Want to return to the Homepage? <a href="./user_home">Home</a></p>

<div class="fluid-container">
	<form class = "form-horizontal" method = "post">
		<div class="col-6">
			<h1>Current Employee Details</h1> 	
		</div>
		<div class = "col">
		
		</div>
		<div class="row">
			<div class="col">
				Firstname: ${firstname}
			</div>
			<div class="col">
				Lastname: ${lastname}
			</div>
			
			<div class = "col">
				Position Title: ${position_title}
			</div>
		</div>	
		<div class = "col">
		
		</div>
		<div class = "col"> 
			<h1> Current Manager Details </h1>
		</div>
		
		<div class= "row">
			<div class = "col">
				Manager First Name: ${ManagerFirstName}
			</div>
			<div class = "col">
				Manager Last Name: ${ManagerLastName}
			</div>
			<div class = "col">
				Manager Position Title: ${ManagerPositionTitle}
			</div>
		</div> 
		
		<div>
			<h1> Current non finished SOPs </h1>
		</div>
			<div class="col">
				Showing results ${(page*displaySize) + 1} - ${fn:length(sops) lt (((page+1)*displaySize) - 1)?fn:length(sops):(((page+1)*displaySize) - 1)} of ${fn:length(sops)}
			</div>
		<div class="row">
			<div class="col-1">
			
			</div>
			<div class="col-2 text-center">
				<p><b>ID / Version / Author ID</b></p>
			</div>
			<div class="col-3 text-center">
				<p><b>Title</b></p>
			</div>
			<div class="col-3 text-center">
				<p><b>Description</b></p>
			</div>
			<div class="col-3 text-center">
				<p><b>Priority</b></p>
			</div>
		</div>
		
		<c:forEach begin="${page*displaySize}" end="${((page+1)*displaySize)}" items="${sops}" var="current">
			<div class="row">
				<div class="col-1 text-center">
					<p><a href="CompleteSOP?sopID=${current.ID}">Complete</a>
				</div>
				<div class="col-2 text-center">
					<p>${current.ID} / ${current.version} / ${current.authorID}</p>
				</div>
				<div class="col-3 text-center">
					<p>${current.title}</p>
				</div>
				<div class="col-3 text-center">
					<p>${current.description}</p>
				</div>
				<div class="col-3 text-center">
					<p>${current.priority}</p>
				</div>
			</div>
		</c:forEach>
		
		<input type="hidden" name="page" value="${page}">
		<input type="hidden" name="displaySize" value="${displaySize}">
		<div class="row">
			<div class="col-2 text-center">
				<c:if test="${page gt 0}">
					<button type="submit" name="changePage" value="prev" class="btn btn-info">Prev Page</button>
				</c:if>
			</div>
			<div class="col-2 text-right">
				Results Per Page:
			</div>
			<c:if test="${displaySize != 5}">
				<div class="col-1">
						<button type="submit" name="changeDisplaySize" value="5" class="btn btn-info">5</button>
				</div>
			</c:if>
			<c:if test="${displaySize != 10}">
				<div class="col-1">
						<button type="submit" name="changeDisplaySize" value="10" class="btn btn-info">10</button>
				</div>
			</c:if>
			<c:if test="${displaySize != 25}">
				<div class="col-1">
						<button type="submit" name="changeDisplaySize" value="25" class="btn btn-info">25</button>
				</div>
			</c:if>
			<div class="col-2 text-center">
				<c:if test="${fn:length(users) gt (displaySize*(page + 1))}">
					<button type="submit" name="changePage" value="next" class="btn btn-info">Next Page</button>
				</c:if>
			</div>
		</div>
			
		</form>	
</div>
</body>
</html> 