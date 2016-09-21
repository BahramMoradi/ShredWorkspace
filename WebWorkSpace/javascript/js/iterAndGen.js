p('Iterators and generators');
l();

function makeIterator(arr){
    var nextIndex=0;
    return {
        next:function(){
            return nextIndex<arr.length? {value:arr[nextIndex++],done:false}:{done:true}
        }
    }
}

function Iter(arr){
    var index=0;
   this.hasNext=function(){
       return index<arr.length;
   }
   this.next=function(){
       return arr[index++];
   }
}


var iter=new Iter([1,2,3,4]);
while(iter.hasNext()){
    p(iter.next());
}

function* idMaker(){
    var index=0;
    while(true){
        yield index++;
    }
}

var gen=idMaker();
for(var i=0;i<10;i++){
p(gen.next().value);}