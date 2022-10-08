<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Music And Food</title>
</head>
<body>
<pre>
<h1>Welcome To Hotal</h1>
<form action="food.do">
Item-Name<input type="text" name="itemName"/>
Price<input type="text" name="price"/>
Hotal-Name:<select name="hotalName">
<option>Udupi Hotal</option>
<option>Catappa Hotal</option>
<option>Kalyan-Hotal</option>
<option>Darshan-Hotal</option>
</select>
<br>
Hotal-Type:<select name="hotalType">
<option>Veg</option>
<option>Non-veg</option>
<option>Veg and Non-veg</option>
</select>
<br>
Hotal-Location:<select name="hotalLocation">
<option>Btm</option>
<option>Rajaji nagar</option>
<option>Mico Layout</option>
</select>
<br>
Orderd:<select name="orderd">
<option>Veg</option>
<option>Non-veg</option>
<option>Veg and Non-veg</option>
<option>Biryani</option>
<option>Egg Rise</option>
</select>

Quantity:<select name="quantity">
<option>100gm</option>
<option>1kg</option>
<option>1.5kg</option>
<option>2kg</option>
<option>5kg</option>
</select>

 <br> <br> <input type="Submit" value="Add"
			style="color: White; background: blue;"> <br> <br>
</form>
</pre>
</body>
</html>