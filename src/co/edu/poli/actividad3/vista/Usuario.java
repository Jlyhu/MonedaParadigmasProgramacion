package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad4.servicios.Griega;
import co.edu.poli.actividad4.servicios.ImplementacionOperacionCRUD;

public class Usuario {

    public static void main(String[] args) {
    	//Protector
    	 Protector protector = new Protector("P001", "Plástico", "Caja");
    	 
    	 //Pais
    	 Pais pais = new Pais("COL", "Colombia");
        //Moneda
    	 Moneda moneda = new Conmemorativa(
    			    "M001", "Oro", "Mediano", "1500", "Conmemorativa", "Rara", "Moderna",
    			    2019, true, protector, pais,
    			    false, "Evento especial"
    			);
        
        // certificado
        Certificado certificado = new Certificado("C001", "2023-05-10", "Banco Central", moneda);


        //valoración
        Valoracion valoracion = new Valoracion("V001", "profesional", "buena", moneda);

        //catálogo
        Moneda[] monedasCatalogo = { moneda };
        Catalogo catalogo = new Catalogo("CAT001", "2025-08-21", 1500.0, "digital", monedasCatalogo);
        catalogo.documentarMonedas();
    
        //Coleccionista
        Coleccionista coleccionista = new Coleccionista("C001", "Experto", "10 años", "Pepito");
        
        //colección
        Moneda[] monedasColeccion = { moneda };
        Coleccion coleccion = new Coleccion("COL001", "Privado", "Histórica", monedasColeccion, coleccionista);
        
        //sobreEscritura
        Antigua monedaAntigua = new Antigua(
        	    "A001", "Bronce", "Pequeño", "2000", "Histórica", "Muy rara", "Colonial",
        	    1800, true, protector, pais,
        	    "XIX", "Buena");
        
        Conmemorativa monedaConmemorativa = new Conmemorativa(
        	    "C001", "Plata", "Grande", "3000", "Conmemorativa", "Rara", "Moderna",
        	    2020, true, protector, pais,
        	    true, "Independencia de Colombia");
        
        Griega monedaGriega = new Griega(
        	    "G001", "Oro", "Mediano", "5000", "Histórica", "Única", "Antigua",
        	    -300, true, protector, pais,
        	    "IV a.C.", "Excelente",
        	    "Atenas", "Clásico");


        
        String resultadoBusqueda = coleccion.buscarMoneda("M001");
        System.out.println("Resultado de búsqueda: " + resultadoBusqueda);
        System.out.println("Año de creación de la moneda: " + moneda.calcularEdadActual());

        System.out.println("\n=== INFORMACIÓN PAÍS ===");
        System.out.println(pais);
        
        System.out.println("\n=== INFORMACIÓN PROTECTOR ===");
        System.out.println(protector);
        
        System.out.println("\n=== INFORMACIÓN DE LA MONEDA ===");
        System.out.println(moneda);

        System.out.println("\n=== INFORMACIÓN DEL CERTIFICADO ===");
        System.out.println(certificado);

        System.out.println("\n=== INFORMACIÓN DE LA VALORACIÓN ===");
        System.out.println(valoracion);

        System.out.println("\n=== INFORMACIÓN DEL CATÁLOGO ===");
        System.out.println(catalogo);

        System.out.println("\n=== INFORMACIÓN DEL COLECCIONISTA ===");
        System.out.println(coleccionista);
        
        System.out.println("\n=== INFORMACIÓN DE LA COLECCIÓN ===");
        System.out.println(coleccion);      
                   
        System.out.println("\n==SOBREESCRITURA==");
        System.out.println(monedaAntigua.obtenerInformacion());
        System.out.println(monedaGriega.obtenerInformacion());
        System.out.println(monedaConmemorativa.obtenerInformacion());
               
        System.out.println("\n==SOBRECARGA==");
        System.out.println(monedaAntigua.obtenerInformacion("Conservada en museo"));
        System.out.println(monedaConmemorativa.obtenerInformacion("Evento nacional"));
        System.out.println(monedaGriega.obtenerInformacion("Hallada en excavación arqueológica"));
        
        //Actividad 6: punto 1 Arreglo 
        Moneda[] monedas = new Moneda[5];
        monedas[0] = monedaAntigua;
        monedas[1] = monedaConmemorativa;
        monedas[2] = monedaGriega;

        System.out.println("\n==SOBREESCRITURA DESDE ARREGLO==");
        for (int i = 0; i < 3; i++) {
            System.out.println(monedas[i].obtenerInformacion());
        }
        
        //Actividad 6: punto 2 invocación métodos polimorfismo
        
        System.out.println("\n==POLIMORFISMO==");
        imprimirInformacionMoneda(monedaGriega);

        Moneda nuevaMoneda = crearMonedaEjemplo();
        System.out.println("Moneda creada por método polimórfico: " + nuevaMoneda.obtenerInformacion());
        
     // Actividad 6: punto 3
     // Los siguientes conceptos se aplicaron en la clase Griega (paquete co.edu.poli.actividad4.servicios):
     // - Atributo que no se puede cambiar: 'region' declarado como 'final'.
     // - Método que no se puede sobrescribir: 'mostrarMensajeFinal()' declarado como 'final'.
     // - Clase que no se puede heredar: 'Griega' declarada como 'final'.

        System.out.println("\n=== PRUEBA CRUD ===");
        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        // Crear monedas
        System.out.println("\nCreación de monedas:");
        crud.create(monedaAntigua);
        System.out.println(monedaAntigua);
        crud.create(monedaConmemorativa);
        System.out.println(monedaConmemorativa);
        crud.create(monedaGriega);
        System.out.println(monedaGriega);

        // Leer todas
        System.out.println("\nListado de monedas:");
        for (Moneda m : crud.read()) {
            if (m != null) {
                System.out.println(m.obtenerInformacion());
            }
        }

        // Leer por ID
        System.out.println("\nBuscar moneda por serial 'C001':");
        Moneda buscada = crud.readId("C001");
        System.out.println(buscada != null ? buscada.obtenerInformacion() : "No encontrada");

        // Actualizar moneda
        System.out.println("\nActualizar moneda con serial 'C001':");
        Moneda actualizada = new Conmemorativa(
            "C001", "Oro", "Grande", "3500", "Conmemorativa", "Muy rara", "Moderna",
            2021, true, protector, pais,
            true, "Actualización histórica"
        );
        System.out.println(crud.update("C001", actualizada));

        // Eliminar moneda
        System.out.println("\nEliminar moneda con serial 'A001':");
        Moneda eliminada = crud.delete("A001");
        System.out.println(eliminada != null ? "Moneda eliminada: " + eliminada.obtenerInformacion() : "No encontrada");
    
    }
    
    //Actividad 6: punto 2 método que recibe un parámetro
  	public static void imprimirInformacionMoneda(Moneda moneda) {
  	    System.out.println("Polimorfismo - Info: " + moneda.obtenerInformacion());
  	}
  	
  	//Actividad 6: punto 2 método que retorna un tipo Moneda
  	public static Moneda crearMonedaEjemplo() {
  	    return new Conmemorativa("C002", "Cobre", "Pequeño", "1000", "Conmemorativa", "Común", "Moderna",
  	                             2022, true, new Protector("P002", "Metal", "Estuche"),
  	                             new Pais("MEX", "México"), false, "Aniversario");
  	}

  	
}
