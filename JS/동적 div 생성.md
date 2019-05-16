<!DOCTYPE html>

<html>

<head>

<style>

#hiddenDiv {

display: none;

}

</style>

</head>

<body>



<h2>동적 div 생성</h2>



<input type="button" value=" 추가 " onclick="addDiv(tankName, i)"><br>

추가 버튼을 눌러보세요.



<div class="chart-area" id="chartArea">



</div>



<script>

var i = 0;

var tankName = 'testTank';



function addDiv(tankName, i){



var div = document.createElement('div');

div.id = 'chartAreaChild' + (i + 1);

document.getElementById('chartArea').appendChild(div);



var div2 = document.createElement('div');

div2.setAttribute("class", "chart-item");

div.appendChild(div2);



var div3 = document.createElement('div');

div3.setAttribute("class", "chart-item");

div3.id = 'chartTk-' + (i + 1);

div.appendChild(div3);



var div4 = document.createElement('div');

div4.innerHTML = '<p>text</p><br>' + tankName;

div4.setAttribute("class", "chart-item-first");

div2.appendChild(div4);



};



     

</script>



</body>

</html>