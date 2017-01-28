var express = require("express");

var app = express();

app.get('/', function(req, resp){
    resp.json({"message": "Hi from th express framwork"})
});

app.get('/index', function(req, resp){
    resp.json({"welcome": "this is th index page"})
});

app.listen(process.env.PORT || 8080);