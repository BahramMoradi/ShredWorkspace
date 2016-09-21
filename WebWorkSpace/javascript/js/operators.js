var cons=document.getElementById('console');
function p(str){

  newContent=document.createTextNode(str);
  newLine=document.createElement('br')

  cons.appendChild(newLine);
  cons.appendChild(newContent);
}
function clearConsole() {
document.getElementById('console').innerHTML='';
}
function l() {
  p('--------------------------------------------------------------------------');
}



p('Operators');
l();
p('Conditional (ternary) operator : condition ? val1 : val2 ');
var age=15;
var myndig=(age>=18)? 'Yes':'No';

p(myndig);

colors=['RED','GREEN','BLUE','YELLOW'];

p(delete colors[0]);

p(colors);


var car={
  Maker:'Toyota',
  Model:'Aygo',
  Year:2012,
  Price:5000
};

p(Object.keys(car));
l();
var keys=Object.keys(car);
for(key of keys ){
  p(key);
};
l();

delete car.Maker;
p(Object.keys(car));
var keys=Object.keys(car);
for(var k in keys){
  p(car[keys[k]]);
}

p(typeof(car));
p(typeof('hello'));

p("Model" in car);

var today=new Date();
p(today);
p(today instanceof Date);

l();

