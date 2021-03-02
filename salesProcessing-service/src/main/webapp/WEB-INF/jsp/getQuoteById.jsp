<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<script>
async function getQId()
{
	console.log("dataa fettchhinnggg123456");
	let url='http://localhost:8081/getQuotation/'+document.getElementById("qId").value;
	console.log("Url : " + url);
	let data = await fetch(url).then(response => { return response.json();});
	console.log(data);
	let values = await JSON.parse(JSON.stringify(data));
	var text = '<tr><th>Name</th><th>Address</th><th>Contact Number</th><th>Email ID</th><th>Insurance Type</th><th>Cost</th></tr>' ;
	text += "<tr><td> " + values.name + "</td> ";
	text += "<td> " + values.address + "</td> ";
	text += "<td> " + values.contactNumber + "</td> ";
	text += "<td> " + values.emailId + "</td> ";
	text += "<td> " + values.insuranceType + "</td> ";
	text += "<td> " + values.cost + "</td></tr> ";
	document.getElementById("tableId").innerHTML = text;
}


</script>
<body>
get quote by id
<input type="text" id="qId"/>
<button type="submit" onclick="getQId()">Get Quote by ID</button>
<br>
<br>
<a href="/">Back</a>
<br>
<br>
<table id="tableId" style="width:100%;"></table>


</body>
</html>