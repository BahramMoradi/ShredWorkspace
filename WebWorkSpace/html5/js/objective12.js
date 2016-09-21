window.onload = function () {

var outerdiv=document.getElementById('outerDiv');
//alert(outerdiv.innerHTML);
//outerdiv.style.backgroundColor="#0F12F0";

//selectiong all p
var ps=document.getElementsByTagName("p");;
//alert(ps.length);

for(var p of ps){
  //alert(p.innerHTML);
//  p.innerHTML='Hello world from javascript';
//alert(p.getAttribute('class'));
}

// using getElementByClassName

var subs=document.getElementsByClassName('subPara');
//alert(subs.length);
for (var p of subs){
  //p.style.backgroundColor="#900098";
}


//

var outer=document.getElementById('outerDiv');
var mainP=document.getElementById('outerDiv').childNodes[1];
//alert(mainP.innerHTML)
document.getElementById('outerDiv').childNodes[1].style.backgroundColor="#F00";
outer.removeChild(mainP);

var form=document.createElement('form');
var input=document.createElement('input');
var attName=document.createAttribute('name');
var attClass=document.createAttribute('class');
attClass.value='custom';
attName.value='name';
input.setAttributeNode(attClass);
input.setAttributeNode(attName);
form.appendChild(input);
outer.appendChild(form);

//a simpler  method

var in2='<input type="text" name="abc" class="custom">';
outer.innerHTML+=in2;


//
var art=document.createElement('article');
art.innerHTML='My newly created article <article> with java script';

document.getElementById('outerDiv').appendChild(art);

//or

var elem=document.getElementById('outerDiv').appendChild(document.createElement('article'));
elem.innerHTML='It is wonderful...';


document.getElementById('innerDiv').innerHTML+='<input type="date" name="birthday">';
document.getElementById('innerDiv').innerHTML+='<input type="range"  min="0" max="100" name="abc">';
document.getElementById('innerDiv').innerHTML+='<input type="number"  min="0" max="100" name="blabla">';

//inserting with befor method

var newDiv=document.getElementById('outerDiv').insertBefore(
  document.createElement('div'),
  document.getElementById('innerDiv'));
newDiv.innerHTML+='add dynamicaly via javascript <br> <input type="date" name="birthday">';

document.getElementById('innerDiv').style.backgroundColor='#F00F00'
if(document.getElementById('innerDiv').hasChildNodes){

var ndi=document.getElementById('innerDiv').insertBefore(
  document.createElement('div'),
  document.getElementById('innerDiv').firstChild
  );
  ndi.innerHTML+='<input type="range" min="0" max="100" name="birthday">';
}





/*
removing element from DOM
*/
 /**
  * removing and inserting back the dom object
  */
var p1=document.getElementById('P1');
var removed=document.getElementById('innerDiv').removeChild(p1);


document.getElementById('innerDiv').insertBefore(
  removed,
  document.getElementById('P2')
);

/**
 Another useful method for removing nodes or elements is removeNode, which takes one
Boolean parameter. Setting the parameter as true tells the method to do a deep removal,
which means that all children are also removed.
 */


var indiv=document.getElementById('innerDiv');
//indiv.removeNode(true);

/**
 * Rplace node and replace child
 */
var innerDiv=document.getElementById('innerDiv');
var newDiv=document.createElement('div');
var tech=[
  'http://www.w3schools.com/js/default.asp',
  'http://www.w3schools.com/css/default.asp',
  'http://www.w3schools.com/html/default.asp',
  'http://www.w3schools.com/angular/default.asp'
]
var names=['Javascript','CSS','HTML','Angular'];
for(var i=0;i<tech.length;i++){
var anchar=newDiv.appendChild(document.createElement('a'));
anchar.setAttribute('href',tech[i])
anchar.text=names[i];
newDiv.appendChild(document.createElement('br'));
}

innerDiv.replaceChild(newDiv,document.getElementById('P1'));










}
