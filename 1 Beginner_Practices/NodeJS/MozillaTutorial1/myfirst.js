var http = require('http');
var dt = require('./teste');

http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/html'});
  dt.Teste1();
  res.end();
}).listen(8081);