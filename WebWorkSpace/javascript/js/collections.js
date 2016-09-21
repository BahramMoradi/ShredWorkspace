p('Indexed collections');
l();
p('Creating an array');

// how to create an array
var books=new Array('Javascript','AngularJs','Jquery');
var langs=Array('Java','Groovy','Scala');
var colors=['RED','GREEN','BLUE'];

// array with length

var bo=new Array(5);
var la=Array(5);

var co=[];
co.length=5;

//populate array
langs[3]='Play 2.0';
p(langs.length);

//creating objects
var obj={};


l();
p('Iterations')
var divs=document.getElementsByTagName('div');
for(var i=0,div;div=divs[i];i++){
//do somting  with div
}


l()
p('Maps');

var mp=new Map();
mp.set('Name','Bahram');
mp.set('Role','Developer');
mp.set('Car','Seat');

p(mp.size);
p(mp.has('Name'));
p(mp.get('Name'));
p(mp.delete('Car'));

for (var [key, value] of mp){
    p(key+'  :  '+value);
}
mp.clear();
p(mp.size);
l();
p('-------  set -----------');
var mySet=new Set();
mySet.add(1);
mySet.add('Bahram');
mySet.add('Role');

for (var str of mySet){
    p(str);
}

p(mySet.has('Bahram'));
p(mySet.delete(1));

for(var s of mySet){
    p(s);
}

var arr=Array.from(mySet);

for(var vr of arr){
    p(vr);
}
