/**
 * Created by bam on 02-09-2016.
 */
import static Utils.*
topic("Groovy Design Patterns")

topic("Strategy Pattern","Remove duplicated code by using closer")

def totalPrices(List<Integer> prices,selector){
    int total=0
    prices.each {
        if(selector(it)){
            total+=it
        }

    }
    total
}

def prices=[1,2,3,4,10,11,12,13]
println totalPrices(prices) {it>10}
println totalPrices(prices,{it<10})
println totalPrices(prices,{true})

topic name='Meta-Programming',description='Groovy meta-programming means you can add methods to any class at runtime. This\n' +
        'allows you to add helper methods to commonly used classes to make your code more\n' +
        'concise and readable.'


String.metaClass.firstChar={
 delegate.charAt(0)
}

println 'tsl'.firstChar()


topic 'Categories','Category is one of the many meta-programming techniques available in Groovy. A Category\n' +
        'is a class that can be used to add functionality to existing classes. It can be useful when\n' +
        'you don’t want to mess with a class for the whole application, but only want special\n' +
        'treatment for a limited section of the code.To make a Category, you create some static methods that have at least one parameter\n' +
        'of a particular type (e.g., an integer). When the category is used, that type (the type of\n' +
        'the first parameter) appears to have those methods in addition to its previously defined\n' +
        'methods. The object on which the method is called is used as the first parameter'

import groovy.time.TimeCategory

def date=new Date()
println date

use(TimeCategory){
    nextWeek=date+1.week+10.hours-30.seconds
}

println nextWeek

@Category(List)
class additionalFunctions{
    List even(){
        def ls=[]
       this.each{
           if(it%2==0){ls<<it}
       }

        ls
    }
    List odd(){
        def ls=[]
        this.each{
            if(it%2!=0){ls<<it}
        }

        ls
    }
}

def records=[1,2,3,4,5,6,7,8,9]
use(additionalFunctions){
   println records.even()
    println records.odd()
}

// adding functionality to ranges

def r=1..10

@Category(Range)
class RangeUtils{
    List even(){
        def ls=[]
        this.each{
            if(it%2==0){ls<<it}
        }

        ls
    }
    List odd(){
        def ls=[]
        this.each{
            if(it%2!=0){ls<<it}
        }

        ls
    }
    Double sum(){
        def s=0.0
        this.each {it->s+=it}
        s
    }
}



use(RangeUtils){
    println r.sum()
    println r.even()
    print r.odd()
}


topic 'Delegation','Delegation is when a class has methods that directly call (method signature identical)\n' +
        'methods of another class. This is hard in Java because it is difficult and time consuming to\n' +
        'add methods to a class'



public class UList{
    @Delegate final List ls
    public UList(List ls){
        this.ls=ls;
    }
    public UList(){
        this.ls=[];
    }
    public remove(int index){
        false
    }
    public void printme(){
        println ls
    }
}


def mls=[1,2,3,4,5,6]
def ulist=new UList(mls)
println ulist.remove(0)
ulist.printme()




















