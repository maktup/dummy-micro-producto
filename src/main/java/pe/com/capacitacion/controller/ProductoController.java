package pe.com.capacitacion.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j; 
import java.util.ArrayList;
import java.util.List;
 
/**
 * ProductoController
 * @author cguerra
 **/
 @Slf4j      //Autogenerar LOG4J. 
 @RestController
 @RequestMapping( "/dummy-micro-producto" )   //NO USAR: [server.servlet.context-path], 'BOOT-ADMIN' reconocera el 'ACTUATOR'.
 public class ProductoController{

        private String vProducto_01 = "{ \"nombre\": \"polo\",       \"precio\": 50,  \"cantidad\": 4, \"importe\": 200 }";
        private String vProducto_02 = "{ \"nombre\": \"pantalones\", \"precio\": 80,  \"cantidad\": 3, \"importe\": 240 }";     	 
        private String vProducto_03 = "{ \"nombre\": \"zapatillas\", \"precio\": 250, \"cantidad\": 1, \"importe\": 250 }"; 
        private String vProducto_04 = "[" + vProducto_01 + "," + vProducto_02 + "," + vProducto_03 + "]";	 
	 
        private List<String> listaProductos = new ArrayList<String>();  
 
	   /**
	    * consultarProductosPorId	
	    * @param  id
	    * @return String 
	    **/
		@GetMapping( "/get/productos/{id}" )
		public String  consultarProductosPorId( @PathVariable( "id" ) long id ){
			   log.info( "'consultarProductosPorId': id={}", id );
    
	           this.listaProductos.add( this.vProducto_01 );	   
	           this.listaProductos.add( this.vProducto_02 );
	           this.listaProductos.add( this.vProducto_03 );
 	           
	           String vDatoJson = "";
	           for( int i=0; i<this.listaProductos.size(); i++ ){	        	   
	        	    if( (i+1) == id ){
	        	    	vDatoJson = this.listaProductos.get( i ); 
	        	    	break; 
	        	    }  
			   }
 
			   String objResponseMsg = vDatoJson;
			   return objResponseMsg; 
		} 
		
	   /**
	    * consultarProductos	
	    * @return String 
	    **/
		@GetMapping( "/get/productos" )
		public String  consultarProductos(){
			   log.info( "'consultarProductos'" );
 
			   String objResponseMsg = vProducto_04;
			   return objResponseMsg; 
		} 
		
 }

 