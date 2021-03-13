<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background: #34495E;
    background: -webkit-linear-gradient(to right, #34495E, #AEB6BF);
    background: linear-gradient(to right, #34495E, #AEB6BF);
    min-height: 100vh;

}
.container {
    width: 60%;
    }
</style>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<!-- <a href="/saveQuote">Save Quote</a>
<br>
<br>
<a href="/getQuotes">Get Quotes</a>
<br>
<br>
<a href="/getQuoteById">Get Quote By Id</a> -->
<div class="container" style="margin-top:40px">
  <div class="panel panel-default">
    <div class="panel-body">
		<a href="/saveQuote">Save Quote</a>
		<br>
		<br>
		<a href="/getQuotes">Get Quotes</a>
		<br>
		<br>
		<a href="/getQuoteById">Get Quote By Id</a>
	</div>
  </div>
</div>
</body>
</html>