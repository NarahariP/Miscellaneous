<html>
<head>
<title>Date</title>
<script type="text/javascript">
function setDate(){
	this.dateFiled = opener.dateField;
	this.inDate = dateField.value;
	
	var now=new Date();
	var day= now.getDate();
	var month = now.getMonth();
	var year= now.getYear();
	
	if(year<1000)
		year+=1900
	
}
</script>
<style type="text/css">
.dayButton{width: 30px;text-align: center;}
</style>
</head>
<body bgcolor="#FFFFFF" onload="setDate()">
<center>
<table cellpadding=0 cellspacing=0 border=0 summary="Calendar">
<form name="calControl" onSubmit="return false;">
<tr><td colspan="7">
<center>
<select name="month" onChange="selectDate()">
	<option>Janauary
	<option>Janauary
	<option>Janauary
	<option>Janauary
	<option>Janauary
	<option>Janauary
</select>
<input type="text" name="year" size="4" maxlength="4" onchange="selectDate()">
</center>
</td></tr>
<tr>
<td colspan="7">
<center>
	<input type="button" name="previousYear" value="<<" alt="First" onclick="setPreviousYear()">
	<input type="button" name="previousYear" value="<" alt="Previous" onclick="setPreviousMonth()">
	<input type="button" name="previousYear" value="Today" alt="Today" onclick="setToday()">
	<input type="button" name="previousYear" value=">" alt="Next" onclick="setNextMonth()">
	<input type="button" name="previousYear" value=">>" alt="Last" onclick="setNextYear()">
</center>
</td>
</tr>



</form>
</table>
</center>
</body>
</html>