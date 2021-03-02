

IMPORTANTE:
----------
* MICROSERVICIO Dummy para pruebas, que devuelve información básica de PRODUCTOS.


Los LINKs del 'MICROSERVICIO' son:
---------------------------------

  1. Las 'URI' de tipo [GET] son:
     ---------------------------
  
     - consultarProductos: 
	   $ curl http://localhost:8080/dummy-micro-producto/get/productos
  
     - consultarProductosPorId: 
	   $ curl http://localhost:8080/dummy-micro-producto/get/productos/{id}
	 
	 
	   
     - consultarClientes [CLUSTER-IP]: 
	   $ curl http://my-producto-service-ci:8080/dummy-micro-producto/get/productos
	   
     - consultarClientesPorId [CLUSTER-IP]: 
	   $ curl http://my-producto-service-ci:8080/dummy-micro-producto/get/productos/{id}
 
 
DETALLE:
------- 
* Para INFORMACIÓN interna del MICROSERVICIO, apoyarse en ACTUATOR ingresando a: 'http://localhost:8080/actuator'


BANNERs:
-------
* http://www.patorjk.com/software/taag

