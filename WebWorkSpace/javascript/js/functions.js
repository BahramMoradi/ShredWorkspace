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
function dl() {
  log('--------------------------------------------------------------------------');
}
clearConsole();
log('functions');
//dl();
dl();
log('Primitives are passed by value, none primitives passed by refrence ')
var i=0,j=0;

function changeme(me) {
  me=10;
}
function passByRef(arr) {
  arr[0]=100;
}
function passByRef2(obj) {
obj.year=2018;
}

changeme(i);
changeme(10);
log(i==0);
log(j==0);


// pass by refrence

var grads=[0,12,13,78,50];
passByRef(grads);
log(grads[0]==100);
dl();

log('changeing car property');
var car={maker:'Seat',model:'Toledo',year:2015};
passByRef2(car);
log(car.year==2018);


dl();
log('functions decleration...');

// 1)
function square(what) {
  return what*what;
}

log(square(10));
dl();

var sum=function(upper){
  var s=0;
  for (var i = 0; i <= upper; i++) {
    s+=i;
  }
  return s;
}
log(sum(10));

dl();
log('Function scope');

dl();
log('Nested function');
function addSquar(a,b){

function square(x){return x*x;}
return square(a)+square(b);
}

log(addSquar(3,4));

function outside(x) {
  function inside(y) {
    return x+y;
  }
  return inside;
}


var ins=outside(5);
var res=ins(3);
log(res);


log('or');

log(outside(5)(6));

function Person(name){
  var role;
  return {
    setName:function(newName){
      name=newName;
    },
    getName:function(){
      return name;
    },
    setRole:function(newRole){role=newRole},
    getRole:function(){return role;}
  }

}


var p=Person('Bahram');
p.setName('Bahram Moradi');
p.setRole('Developer');

log(p.getName()+'     '+p.getRole());


dl();
log('function argument');

function asCSV(sep) {
  var result="";
  var i;
  for (i = 1; i < arguments.length; i++) {
    result+=arguments[i]+sep;
  }
  return result;
}

log(asCSV(";","Java","Scala","Groovy"));
dl();
log('Using default arguments.......');

function User(name, role='user'){
  return name+" "+role;
}

var u=User('Bahram');
log(u);

var u2=User('Bahram',role='Developer');
log(u2);
dl();
log('Rest parameters');

function multiplay(m,...params) {
  return params.map(x=>m*x);
}

log(multiplay(3,1,2,3));

function Child(){
  var self=this;
  self.age=0;


  setInterval(function growUp(){
    self.age++;
  },1000);
}

var ch=new Child();
log(ch.age);
