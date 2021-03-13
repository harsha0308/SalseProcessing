<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  
  border-collapse: collapse;
  margin-top:20px;
}
th{
color:#935116;
 font-size: large;
font:bold;
}
td {
color:white;
}
body {
    background: #34495E;
    background: -webkit-linear-gradient(to right, #34495E, #AEB6BF);
    background: linear-gradient(to right, #34495E, #AEB6BF);
    min-height: 100vh;
    

}
label{
color:white;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
<!-- get quote by id
<input type="text" id="qId"/>
<button type="submit" onclick="getQId()">Get Quote by ID</button>
<br>
<br>
<a href="/">Back</a>
<br>
<br>
<table id="tableId" style="width:100%;"></table>
 -->
<div class="container" style="margin-top:40px">
    <div class="form-group">
      <label class="control-label col-sm-2" for="name">Get Quote By Id:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="qId" placeholder="Enter Id" required>
      </div>
    </div>
     <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary" onclick="getQId()">Get Quote</button>
      </div>
    </div>
       <div class="form-group">        
      		<div class="col-sm-offset-2 col-sm-10">
				<a href="/"  class="btn btn-default">Back to HomePage</a>
			</div>
		</div>
</div>


    <div class="container py-5">
        <div class="row">
            <div class="col-lg-12 mx-auto bg-white rounded shadow">
                <!-- Fixed header table-->
                <div class="table-responsive">
                    <table  id="tableId" style="width:100%"></table>
                </div><!-- End -->
            </div>
        </div>
    </div>
</body>
</html>