package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad4.servicios.Griega;

public class Usuario {

    public static void main(String[] args) {
    	//Protector
    	 Protector protector = new Protector("P001", "Plástico", "Caja");
    	 
    	 //Pais
    	 Pais pais = new Pais("COL", "Colombia");
        //Moneda
        Moneda moneda = new Moneda(
        		"M001",           // serial
                "Oro",            // material
                "Mediano",        // tamaño
                "1500",           // valor
                "Conmemorativa",  // tipo
                "Rara",           // rareza
                "Moderna",        // época
                2019,             // año de creación
                true,             // es auténtica
                protector,        // objeto Protector
                pais              // objeto Pais
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
        
    }
}
