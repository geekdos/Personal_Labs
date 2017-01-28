var request = require("request");
var fs = require("fs");

var file = fs.createWriteStream("geek.jpg");
request('C:\Users\theXuser\Downloads\KHACHIAI_OUSSAMA.jpg').pipe(file);

file.on('finishe', function(){
    console.log('The image is downloaded !!');
})