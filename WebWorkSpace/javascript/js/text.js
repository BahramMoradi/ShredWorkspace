try {
    p('Text formatting')
    l();
    var str1="Str 1";
    var str2='Str 2';
    var s =new String("Hello java script");
    p(typeof(str1));
    p(typeof(s));  
var sv="p('hello world');";
eval(sv);

var enstr="Hello world";
p(enstr.length);
p(enstr.replace('w','W'))
} catch (error) {
    p(error);
}
