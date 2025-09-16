package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad3.modelo.*;

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
        
        System.out.println(moneda.mostrarInformacion());
        System.out.println("Año de creación de la moneda: " + moneda.calcularEdad());



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
        
        String resultadoBusqueda = coleccion.buscarMoneda("M001");
        System.out.println("Resultado de búsqueda: " + resultadoBusqueda);

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

        
    }
}
