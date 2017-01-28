var net = require('net');

var server = net.createServer(function(soket){
    console.log("Connecting From: "+soket.remoteAddress);
    soket.end("Hello World From TCP Soket");
})

server.listen(7000, "127.0.0.1");