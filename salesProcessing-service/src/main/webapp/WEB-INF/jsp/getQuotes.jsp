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
async function retrieveData()
{
console.log("data fetching");
let data = await fetch('http://localhost:8081/getAllQuotation').then(response => { return response.json();});
let values = await JSON.parse(JSON.stringify(data));
console.log(values[0] + " values 123456");
var text = '<tr><th>Name</th><th>Address</th><th>Contact Number</th><th>Email ID</th><th>Insurance Type</th><th>Cost</th></tr>' ;
for (i = 0; i < values.length; i++) {
	text += "<tr><td> " + values[i].name + "</td> ";
	text += "<td> " + values[i].address + "</td> ";
	text += "<td> " + values[i].contactNumber + "</td> ";
	text += "<td> " + values[i].emailId + "</td> ";
	text += "<td> " + values[i].insuranceType + "</td> ";
	text += "<td> " + values[i].cost + "</td></tr> ";
}
document.getElementById("tableId").innerHTML = text;
console.log(data);
}
</script>
<body>
<button onclick="retrieveData()">Get all quotes</button>
<br>
<br>
<a href="/">Back</a>
<br>
<br>
<table id="tableId" style="width:100%;">

</table>


</body>
</html>