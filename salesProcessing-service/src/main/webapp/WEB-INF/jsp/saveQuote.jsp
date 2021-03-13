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
label{
color:white;
}
h2{
text-align:center;
}
</style>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<script>
function saveQuote(){
console.log('Hi, fetching your data here')

let data = {
  	"name": document.getElementById("name").value,
    "address":document.getElementById("address").value,
    "contactNumber":document.getElementById("contact").value,
    "emailId":document.getElementById("email").value,
    "insuranceType":document.getElementById("insType").value,
    "cost":document.getElementById("cost").value
	}
fetch('http://localhost:8081/saveQuotation', {
  method: 'POST',
  headers: {
    'content-type': 'application/json',
  },
  body: 
    JSON.stringify(data)
  
})
  .then(response => {
  	
    console.log(response)
    alert("Data saved");
    
  })
  .catch(err => {
    console.log(err)
  })
  }
</script>
<body>
Save a Quote
<br>
<!-- <form onsubmit="saveQuote()">
<input type="text" placeholder="Name" id="name" required />
<br>
<input type="text" placeholder="Address" id="address" required>
<br>
<input type="text" pattern="(7|8|9)\d{9}$" placeholder="ContactNumber" id="contact" required>
<br>
<input type="text" placeholder="Email Id" id="email" required>
<input type="email" pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}" placeholder="Email Id" id="email" required>
<br>
<input type="text" placeholder="Insurance Type" id="insType" required>
<br>
<input type="text" placeholder="Cost" id="cost" required>
<br> 
 <button type="submit" onclick="saveQuote()">Save Quote</button> // dont use this
<button type="submit" >Save Quote</button>
</form> -->
<div class="container" style="margin-top:40px">
  <h2>Save a quote</h2>
  <form class="form-horizontal" onsubmit="saveQuote()">
     <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="name" placeholder="Enter Name" required>
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="address">Address:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="address" placeholder="Enter Address" required>
      </div>
    </div>
       <div class="form-group">
      <label class="control-label col-sm-2" for="contact">Contact Number:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="contact" pattern="(7|8|9)\d{9}$" placeholder="Enter Contact Number" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email Id:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}"  placeholder="Enter Email Id" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="insType">Insurance Type:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="insType" placeholder="Enter Insurance Type" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="cost">Cost:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="cost" placeholder="Enter Cost" required>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary" >Submit</button>
      </div>
    </div>
  </form>
  	<br>
	<br>
	<div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
	<a href="/"  class="btn btn-default">Back to HomePage</a>
	</div>
	</div>
	
</div>

</body>
</html>