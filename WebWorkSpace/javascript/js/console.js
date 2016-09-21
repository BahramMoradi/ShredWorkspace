var cons=document.getElementById('console');
function p(str){

  newContent=document.createTextNode(str);
  newLine=document.createElement('br')

  cons.appendChild(newLine);
  cons.appendChild(newContent);
}
function clearConsole() {
document.getElementById('console').innerHTML='';
}
function l() {
  p('--------------------------------------------------------------------------');
}

