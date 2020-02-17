<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="stylesheet.css"
	media="screen" />
<title>Descubra sua idade!</title>
</head>
<body>
	<h1>Descubra sua idade!</h1>
	<br>
	<form action="/idade/idadeServlet" method="post">
		<div>
			<label for="data"> Informe a data do seu aniversario:</label><br>
			<br> <input type="date" id="data" name="data">
		</div>
		<br>
		<div class="buttom">
			<button type="submit">Calcular</button>
		</div>
	</form>
	<%
		if (request.getAttribute("idade") != null) {
	%>
	<p>Voce tem ${idade} anos! </p>
	<%
		}
	%>
</body>
</html>