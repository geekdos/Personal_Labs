var http = require('http');

var server = http.createServer(function(request, response){
    response.writeHead(200, {"Content-Type":"text/plain"});
    response.end("Hello World From the Http Node Response")
});

server.listen(7000)