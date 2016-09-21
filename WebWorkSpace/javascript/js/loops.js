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


log('Loop in javascript');
log('--------------------------------------------------------------------------------------------------------');

log('1) for loop');

var list=[];
list.push('Java');
list.push('Groovy');
list.push('Scala');
log(Array.isArray(list));
for(var i=0; i<list.length;i++){
  log(list[i]);
}

log('2) do ..while')


var books=[];
books[0]='Beginning Javascript';
books[1]='Javascript fullstack' ;
books[2]='Jquery';
var books_index=0;
do{
  log(books[books_index]);
  books_index++;

}while(books_index<books.length);

log('3) while...')


var colors=['RED','GREEN','BLUE'];
var color_index=0;
while (color_index < colors.length) {
    log(colors[color_index]);
    color_index++;
}
log('4) for ...in');
for (var color in colors) {
log(color);
log(colors[color])
}

log('5) for ... of');
for (let v of colors) {
  log(v);
}
