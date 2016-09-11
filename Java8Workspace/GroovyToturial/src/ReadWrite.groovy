/**
 * Created by BAM on 31-08-2016.
 */
def topic(name,description=""){
    println "----------------------------------------------------------------------------------------------------------"
    println "               $name                   "
    if(description!=""){
        println "$description"
    }
    println "-----------------------------------------------------------------------------------------------------------"
}

topic("Spread","The spread operator can be used to access the property of every element in a collection.\n" +
        "It can be used instead of collect in many cases.")
class Cat{
    String name
    int age;
    def Cat(String name,int age){
        this.name=name
        this.age=age
    }
}
def list=[new Cat("Miao",12),new Cat("Piao",1),new Cat("Saw",2)]
println list*.name


topic("Gpath","GPath is something like XPath in Groovy. Thanks to the support of property notation for\n" +
        "both lists and maps, Groovy provides syntactic sugar making it really easy to deal with\n" +
        "nested collections")
def listOfMap=[[a:1,b:2,c:3],[a:4,b:5,c:6],[a:7,b:8,c:9]]
println "listOfMap: $listOfMap"
println "listOfMap.a: "+listOfMap.a
println "listOfMap.b $listOfMap.b"
println "Spread notation: listOgMap*.a :  $listOfMap*.a"

topic("IO and Files")
new File("output.txt").text="Hello world Groovy io \nWrite to a file: new File(\"output.txt\").text=\"line two \" \nRead from a file new File(\"output.txt\").eachLine{ line ->...}"

new File("output.txt").eachLine {line-> println line}
new File("output.txt").eachLine {line,num-> println "$num : $line"}

topic("URLs")

def resp="http://google.com".toURL().text
println resp

topic("Ranges","The Range is a built-in type in Groovy. It can be used to perform loops, in switch cases,\n" +
        "extracting substrings, and other places. Ranges are generally defined using the syntax\n" +
        "start..end .")
(1..4).each {println it}
def ls=["a","b","c","d","e"]
(0..(ls.size()-1)).each {println ls.get(it)}

for(i in 1..4){
    println "$i Hello world"
}

def text="Hello world from Groovy"
println text[0..4]
println text[-6..-1]

def names=["Java","Scala","Groovy"]
println names[0..1]


