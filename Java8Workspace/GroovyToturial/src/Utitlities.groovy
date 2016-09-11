import javafx.collections.ObservableList

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

topic("ConfigSlurper","ConfigSlurper is a utility class for reading configuration files defined in the form of Groovy\n" +
        "scripts")

def config=new ConfigSlurper().parse('''
app.date=new Date()
app.age=42
app{
name="Test config"
}
''')

def prop=config.toProperties()
println prop."app.date"
println prop."app.age"
println prop."app.name"

topic("Expando","The Expando class can be used to create a dynamically expandable object. You can add\n" +
        "fields and methods. This can be useful when you want to use extremely dynamic\n" +
        "meta-programming")

def person=new Expando()
person.name={-> "Bahram"}
person.say={String msg->"${person.name} says: ${msg}"}
println person.say("Hello")


topic("Observable","Groovy comes with observable lists, maps, and sets. Each of these collections triggers\n" +
        "PropertyChangeEvent (from the java.beans package) when elements are added,\n" +
        "removed, or changed.")

def list=new groovy.util.ObservableList()
def printer={e-> println e}
list.addPropertyChangeListener(printer)
list.add("Hello world")

def map=new ObservableMap({name, value -> !(value ==null) });

map.a="Hello"
map.b=null

print map
