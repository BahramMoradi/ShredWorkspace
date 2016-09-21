try {


var cons=document.getElementById('console');
function log(str){

  newContent=document.createTextNode(str);
  newLine=document.createElement('br')

  cons.appendChild(newLine);
  cons.appendChild(newContent);
}
function clearConsole() {
document.getElementById('console').innerHTML='';

}
clearConsole();
log("-------------------- scope ----------------------");
log("block scope : let ,global scope : var , function scope : var")
var x=42;
log(x);
x="The value of the variable is changed now....";
log(x);

if(true){
  let y=5;
}
/*
cast exception because y is scope level variable
*/
//log(y);
var res=null*50;
log( "null is treated as 0 : for example null*32= "+res);


log(loc==undefined);
var loc;
loc="300,000"
log(loc);

log('---------------- function hoisting-------------------');

foo();

function foo() {
  log('foo');
}
/* cast an exception*/
/*
bar();
var bar=function(){
  log('bar');
}*/

log('----------------------- constant ------------------');
log('The value of a constant object is not protected against modification');
const MY_OBJECT={"Name":"Bahram","Role":"Developer"};
log(MY_OBJECT.Name+" "+MY_OBJECT.Role);
MY_OBJECT.Role="Data Scientist"
log(MY_OBJECT.Name+" "+MY_OBJECT.Role);


log('-------------------- Literals ----------------------------');

var mylist=['Java','Groovy','Scala'];
log(mylist);


var condition=new Boolean('false');
if(condition){
  log('Remember : new Boolean(\'false\') is always evaluated to true.'+
  'Only when null and undefined is passed so the Boolean is evaluated to false')
}

var tota='Toyota';

function carTyps(name) {
  if(name=='seat'){
    return name;
  }
  else{
    return 'we do not sale '+name
  }
}

var car={mycar:"Seat",getcar:carTyps('Honda'),special:tota};

log(car.mycar);
log(car.getcar);
log(car.special);
 var name="Bahram Moradi";
 var role="Developer";

 log(name.length);
 log('--------------- String intrpolation --------------');
log(`Name: ${name}  Role: ${role}`);


log("------------------------------ exceptions------------------");

// throw "This is an exception";

function MyException(message){
  this.message=message;
  this.name="MyException";
}
MyException.prototype.toString = function () {
  return this.name+"       "+this.message;
};

throw new MyException(': This is a custom Exception ');







} catch (e) {
  log(e);
} finally {

}
