/**
 * Created by bam on 02-09-2016.
 */
// this is a generic wow but be careful when you use @CompileStatic..

def list=[1,3,4,'Groovy','Generic']
def List<Integer> ls=[1,2,3,4.6,'Generic']

println list
println ls

def pi =3.141593d
def ten =10
println pi.getClass()
println ten.getClass()



//boolean in Groovy
if('hhha'){println true}
if(!0){println true}
if(!''){println true}
if(50){println true}


// hash in Groovy

def map=[foo:1,bar:2]
map.keySet().each{println (it.getClass())}

def ss='ss'
def dd='dd'

def mp=[ss:4,dd:5]

println mp