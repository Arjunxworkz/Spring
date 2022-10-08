<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<h1>Welcome To Music Player</h1>
<form action="song.do">
Name<input type="text" name="name"/>
Singer<input type="text" name="singer"/>
Duration<input type="text" name="duration"/>
Producer<input type="text" name="producer"/>
Lyrics<input type="text" name="lyrics"/>
Lang:<select name="lang">
<option>English</option>
<option>Hindi</option>
<option>Kannada</option>
<option>Bhojpuri</option>
</select>
<br>
Type:<select name="type">
<option>Slow music</option>
<option>Remix</option>
<option>DjMix</option>
<option>Fast Music</option>
</select>

 <br> <br> <input type="Submit" value="Add"
			style="color: White; background: blue;"> <br> <br>
</form>
</pre>
</body>
</html>