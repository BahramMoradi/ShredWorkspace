import sun.nio.fs.WindowsUserPrincipals

/**
 * Created by BAM on 30-08-2016.
 */
class Person{
    def name=null
    def getName(){
         name
    }
    def setName(newName){
        name=newName
    }
}
def line(){println "------------------------------------------------------------"}
def ls=[1,2,3,4,5,6,7,8,9,10]
ls.findAll {it%2==0}.each {println it}

ls.add(22)

println(ls)
ls.removeElement(22)
println ls

def map=[hello:"hello", no:"No"]
h="hello"
println map.get(h)
println map.containsValue("hello")
map.keySet().each {println map.get(it)}

println map.hello
println map.no

map.hello="hello".toUpperCase()
map.no="no".toUpperCase()
map.newKey="This is th value of the newKey in the map"
println map.newKey

10.times {print "hej, "}

def one =1
def two= 2
println("one = $one and two = $two Time : ${new Date()}")


def inc={i->i+1}
println(inc(5))

println inc.getClass()


def key=53

switch( key )
{
    case "x":
        println "x"
        break
    case 1:
        println 1
        break
    case [1,2,3,4,5,6]:
        println ([1,2,3,4,5,6])
        break
    case 0..100:
        println "It was a number between 1 and 100"
        break
    default:
        println "Not found"
        break
}


def p= new Person()
// elvis operator
def name=p.getName()?:null
println name
if(p?.getName()==null){
    println "person name is null"
}

def user=new User();
user.id=1
user.firstName="Dani"
user.lastName="alvez"
user.age=32
line()
println user
