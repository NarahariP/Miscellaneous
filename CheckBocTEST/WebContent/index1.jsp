<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
    function populate(slct1, slct2) {
        var s1 = document.getElementById(slct1);
        var s2 = document.getElementById(slct2);
        s2.innerHTML = "";
        if (s1.value == "Cat1") {
            var optionArray = ["Subcat1", "Subcat1.1", "Subcat1.2"];
        } else if (s1.value == "Cat2") {
            var optionArray = ["Subcat2", "Subcat2.1", "Subcat2.2"];
        } else if (s1.value == "Cat3") {
            var optionArray = ["Subcat3", "Subcat3.1", "Subcat3.3"];
    }

	var optionArray3= ["Subcat1", "Subcat1.1", "Subcat1.2"];

    for (var option in optionArray) {
        if (optionArray.hasOwnProperty(option)) {
            var pair = optionArray[option];
            var checkbox = document.createElement("input");
            checkbox.type = "checkbox";
            checkbox.name = pair;
            checkbox.value = pair;
            s2.appendChild(checkbox);
    
            var label = document.createElement('label')
            label.htmlFor = pair;
            label.appendChild(document.createTextNode(pair));

            s2.appendChild(label);
            s2.appendChild(document.createElement("br"));    
        }
    }
     for (var option1 in optionArray3) {
      if(! objectsAreSame(option1)){
	        if (optionArray3.hasOwnProperty(option1)) {
          var pair = optionArray3[option1];
          var checkbox = document.createElement("input");
          checkbox.type = "checkbox";
          checkbox.name = pair;
          checkbox.value = pair;
          s2.appendChild(checkbox);

          var label = document.createElement('label')
          label.htmlFor = pair;
          label.appendChild(document.createTextNode(pair));

          s2.appendChild(label);
          s2.appendChild(document.createElement("br"));    
        }
       }
     }
	}
    
	function objectsAreSame(x) {
	var arr = ['Subcat1', 'abcd'];
	   var objectsAreSame = false;
	   for(var propertyName in arr) {
	      if(x == propertyName) {
	         objectsAreSame = true;
	         break;
	      }
	   }
	   return objectsAreSame;
	}
</script>
</head>
<%

CheckBox c1 = new CheckBox(11,"abcd");
CheckBox c2 = new CheckBox(12,"bcde");
CheckBox c3 = new CheckBox(13,"cdef");
CheckBox c4 = new CheckBox(14,"defg");
CheckBox c5 = new CheckBox(15,"efgh");


%>

<body>
<h2>Dynamic Select Dropdown</h2>
<hr />
Choose a Category:
<select id="slct1" name="slct1" onchange="populate(this.id, 'slct2')">
   <option value=""></option>
   <option value="Cat1">Cat1</option>
   <option value="Cat2">Cat2</option>
   <option value="Cat3">Cat3</option>
</select>
<hr />
   Choose Subcategory:
<div id="slct2"></div>
<hr />
</body>
</html>







