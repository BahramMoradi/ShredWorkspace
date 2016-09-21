p('Working with objects');
l();

var car=new Object();
car.Maker='Seat';
car.Model='Toledo';
car.Transmision='Manual';
car.Gear='5';
p(car.Maker);

p(car.yaer);
p(car['Gear']);

p('Iterating over object property');

function showProp(obj,name){
    var res="";
    for (var i in obj){
        if(obj.hasOwnProperty(i)){
            res+=name+"."+i+"="+obj[i]+"\n";
        }
    }
    return res;
}

p(showProp(car,"car"));



p('Defining objects');

var mycar={
    color:'RED',
    wheel:4,
    engine:{cylinder:4,size:1.2,tec:'TSI'}
}

p(mycar.color);
p(mycar.wheel);
p(mycar.engine.cylinder);
p(mycar.engine.size);
p(mycar.engine.tec);
l();
p('Using constructor');
l();
 
function Person(name,role){
    this.name=name;
    this.role=role;
    this.display=function(){
        p(this.name+' '+this.role);
    }
}

var person=new Person('Bahram Moradi','Developer');
p(person.name);
p(person.role);
person.display();
Person.prototype.age=null;

person.age=35;
person.display();
p(person.age);
l();
p('Defining getter and setter');
l();

function User(name,role,sex){
    this.name=name;
    this.role=role;
    this.sex=sex;

    this.getName=function(){return this.name};
    this.setName=function(name){this.name=name}
};


var user=new User('Bahram','Developer',35);

p(user.getName());
p(user.setName('Naser'));
p(user.getName());
l();
p('Details of the object model');
l();
p('Inheritance');
l();
function Employee(){
    this.name="";
    this.dep='General';
}
function Manager(){
    Employee.call(this);
    this.report=[];
}
Manager.prototype=Object.create(Employee.prototype);
function WorkerBee(){
    Employee.call(this);
    this.projects=[];
}
WorkerBee.prototype=Object.create(Employee.prototype);
function SalesPerson(){
    WorkerBee.call(this);
    this.dep="Sales";
    this.quota=199;
}

SalesPerson.prototype=Object.create(Worker.prototype);
function Engineer(){
    WorkerBee.call(this);
    this.dep='engineering';
    this.machine='';
}
Engineer.prototype=Object.create(WorkerBee.prototype);



var bahram=new Engineer();
bahram.name="Bahram Moradi"
bahram.machine="PC";
bahram.projects[0]="Data Extracting";
p(bahram.name);
p(bahram.dep);
p(bahram.machine);
p(bahram.projects);

l();
p('A better example');
l();

function Pet(name){
    this.name=name||"";
}
function Dog(name,color){
    this.base=Pet;
    this.base(name);
    this.color=color||"";
}
function Snake(name,length){
    this.base=Pet;
    this.base(name);
    this.length=length||0;
}

var snake=new Snake("lassie",10);
p(snake.name);
p(snake.length);
