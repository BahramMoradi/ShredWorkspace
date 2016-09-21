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
try{
p('Number and Date');
l();

p('Binary numbers');
var binary=0b0101010101010101;
var octal=02425;
var a=0o123;
var hex=0x12df;

p('Exponentiation');
var num=1E3;
p(num)

p(Number.MAX_VALUE);
p(Number.MIN_VALUE);
p(Number.NEGATIVE_INFINITY);
p(Number.POSITIVE_INFINITY);

l();
p('Method of Number');
var num ='12';
p(Number.isFinite(12));
p(Number.isInteger(12));
p(Number.parseInt(num));

l();
p('Math');
p(Math.abs(-12));
p(Math.sin(90));

var temp=[1,50,23,45,76];
p(Math.min(1,2,3,4,5,6,7,8));

l();
p('Date');
var dt=new Date("December 25,2015");
p(dt);
p(dt.getFullYear())
p(dt.getMonth())
p(dt.getDay())

}catch(err){
    p(err);
}