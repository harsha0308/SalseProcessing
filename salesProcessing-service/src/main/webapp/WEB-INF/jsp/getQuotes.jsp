<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style> -->
<style>
.table-fixed tbody
{
    height: 300px;
    overflow-y: auto;
    width: 100%;
}

.table-fixed thead,
.table-fixed tbody,
.table-fixed tr,
.table-fixed td,
.table-fixed th {
    display: block;
}

.table-fixed tbody td,
.table-fixed tbody th,
.table-fixed thead > tr > th {
    float: left;
    position: relative;

    &::after {
        content: '';
        clear: both;
        display: block;
    }
}

body {
    background: #34495E;
    background: -webkit-linear-gradient(to right, #34495E, #AEB6BF);
    background: linear-gradient(to right, #34495E, #AEB6BF);
    min-height: 100vh;

}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" 
integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
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
<!-- <button onclick="retrieveData()">Get all quotes</button>
<br>
<br>
<a href="/">Back</a>
<br>
<br>
<table id="tableId" style="width:100%;"></table> -->

<!-- For demo purpose -->
<div class="container text-center text-white">
    <div class="row pt-5">
        <div class="col-lg-8 mx-auto">
            <button onclick="retrieveData()" class="btn btn-primary">Get all quotes</button>
			<br>
			<br>
			<a href="/" class="btn btn-primary">Back</a>
			<br>
			<br> 
		
        </div>
    </div>
</div><!-- End -->

    <div class="container py-5">
        <div class="row">
            <div class="col-lg-12 mx-auto bg-white rounded shadow">

                <!-- Fixed header table-->
                <div class="table-responsive">
                    <table  id="tableId" style="width:100%">
                    
                    </table>
                </div><!-- End -->
                
            </div>
        </div>
    </div>

</body>
</html>