package co.edu.poli.actividad3.vista;
import java.util.Scanner;

import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad4.servicios.Griega;
import co.edu.poli.actividad4.servicios.ImplementacionOperacionCRUD;

/**
 * Clase principal que contiene el método {@code main} para ejecutar
 * la aplicación de gestión de monedas y coleccionistas.
 * 
 * Desde aquí se crean instancias de las clases del modelo
 * y se realizan pruebas de funcionamiento.
 * 
 * @author Juliana
 * @version 1.0
 */

public class Usuario {
	
	/**
     * Constructor por defecto de la clase Usuario.
     * Es implícitamente invocado al crear la aplicación.
     */
	
	public Usuario() {
        // Constructor intencionalmente vacío.
    }
    
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args argumentos de línea de comandos (no utilizados en esta versión)
     */ 
	
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
        
        

        
     // ACTIVIDAD 8
        Scanner scanner1 = new Scanner(System.in);
        ImplementacionOperacionCRUD crud1 = new ImplementacionOperacionCRUD();
        final String PATH = "."; // o una carpeta específica
        final String NOMBRE_ARCHIVO1 = "monedas.dat";

        // Cargar datos al iniciar
        Moneda[] monedasCargadas1 = crud1.deserializar(PATH, NOMBRE_ARCHIVO1);
        if (monedasCargadas1 != null) {
            crud1.setMonedas(monedasCargadas1);
        }

        int opcion1;
        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE MONEDAS (ACTIVIDAD 8) ---");
            System.out.println("1. Crear Objeto (Moneda Conmemorativa)");
            System.out.println("2. Listar todos los Objetos");
            System.out.println("3. Listar un Objeto por Serial");
            System.out.println("4. Modificar un Objeto");
            System.out.println("5. Eliminar un Objeto");
            System.out.println("6. Guardar en Archivo");
            System.out.println("7. Cargar desde Archivo");
            System.out.println("8. Salir del menú");
            System.out.print("Seleccione una opción: ");
            
            opcion1 = scanner1.nextInt();
            scanner1.nextLine(); // Consumir el salto de línea

            switch (opcion1) {
            	case 1: // CREATE
            		System.out.println("\n--- CREAR NUEVA MONEDA CONMEMORATIVA ---");
            		String serial1 = leerCampoObligatorio(scanner1, "Serial (Ej: C003): ");
            		String material1 = leerCampoObligatorio(scanner1, "Material (Ej: Plata): ");
            		String tamano1 = leerCampoObligatorio(scanner1, "Tamaño (Ej: Grande): ");
            		String valor1 = leerCampoObligatorio(scanner1, "Valor (Ej: 5000): ");
                
            		System.out.print("Año de creación (Ej: 2022): ");
            		int anoCreacion1 = scanner1.nextInt();
            		scanner1.nextLine();
            		
            		Protector protectorDefault1 = new Protector("P-DEF", "Acrílico", "Cápsula");
            		Pais paisDefault1 = new Pais("DEF", "Desconocido");

            		Moneda nuevaMoneda1 = new Conmemorativa(serial1, material1, tamano1, valor1, "Conmemorativa", "Común", "Moderna",
                        anoCreacion1, true, protectorDefault1, paisDefault1, false, "Sin evento");

            		String mensajeCreate1 = crud1.create(nuevaMoneda1);
            		System.out.println(mensajeCreate1);
            		break;
                case 2: // READ ALL
                    System.out.println("\n--- LISTADO DE TODAS LAS MONEDAS ---");
                    Moneda[] todas1 = crud1.read();
                    boolean encontradas1 = false;
                    for (Moneda m : todas1) {
                        if (m != null) {
                            System.out.println(m.obtenerInformacion());
                            System.out.println();
                            encontradas1 = true;
                        }
                    }
                    if (!encontradas1) {
                        System.out.println(">> No hay monedas en la colección.");
                    }
                    break;
                case 3: // READ ONE
                    System.out.println("\n--- BUSCAR MONEDA POR SERIAL ---");
                    System.out.print("Ingrese el serial a buscar: ");
                    String serialBusqueda1 = scanner1.nextLine();
                    Moneda encontrada1 = crud1.readId(serialBusqueda1);
                    if (encontrada1 != null) {
                        System.out.println(encontrada1.obtenerInformacion());
                    } else {
                        System.out.println(">> Moneda con serial '" + serialBusqueda1 + "' no encontrada.");
                    }
                    break;
                case 4: // UPDATE
                    System.out.println("\n--- ACTUALIZAR MONEDA ---");
                    String serialUpdate1 = leerCampoObligatorio(scanner1, "Ingrese el serial de la moneda a modificar: ");

                    if (crud1.readId(serialUpdate1) != null) {
                        System.out.println("Ingrese los nuevos datos (5 campos primitivos):");
                        String materialUpd1 = leerCampoObligatorio(scanner1, "Nuevo Material: ");
                        String tamanoUpd1 = leerCampoObligatorio(scanner1, "Nuevo Tamaño: ");
                        String valorUpd1 = leerCampoObligatorio(scanner1, "Nuevo Valor: ");
                        
                        System.out.print("Nuevo Año de creación: ");
                        int anoUpd1 = scanner1.nextInt();
                        scanner1.nextLine();

                        Protector pUpd1 = new Protector("P-UPD", "Acrílico", "Cápsula");
                        Pais paUpd1 = new Pais("UPD", "Desconocido");

                        Moneda monedaActualizada1 = new Conmemorativa(serialUpdate1, materialUpd1, tamanoUpd1, valorUpd1, "Conmemorativa", "Común", "Moderna",
                                anoUpd1, true, pUpd1, paUpd1, false, "Actualizado");

                        String mensajeUpdate1 = crud1.update(serialUpdate1, monedaActualizada1);
                        System.out.println(mensajeUpdate1);
                    } else {
                        System.out.println(">> No se encontró moneda con ese serial.");
                    }
                    break;
                    
                case 5: // DELETE                    
                	System.out.println("\n--- ELIMINAR MONEDA ---");
                	

                	// Mostrar seriales disponibles
                	    System.out.println("Seriales disponibles:");
                	    for (Moneda m : crud1.read()) {
                	        if (m != null) {
                	            System.out.println("- " + m.getSerial());
                	        }
                	    }

                    System.out.print("Ingrese el serial de la moneda a eliminar: ");
                    String serialDelete1 = scanner1.nextLine();
                    Moneda eliminada1 = crud1.delete(serialDelete1);
                    if (eliminada1 != null) {
                        System.out.println(">> Moneda eliminada exitosamente: " + eliminada1.getSerial());
                    } else {
                        System.out.println(">> Moneda no encontrada.");
                    }
                    break;
                case 6: // GUARDAR
                    String mensajeGuardar = crud1.serializar(crud1.read(), PATH, NOMBRE_ARCHIVO1);
                    System.out.println(mensajeGuardar);
                    break;

                case 7: // CARGAR
                    Moneda[] cargadas1 = crud1.deserializar(PATH, NOMBRE_ARCHIVO1);
                    if (cargadas1 != null) {
                        crud1.setMonedas(cargadas1);
                        System.out.println(">> Archivo cargado correctamente.");
                    }
                    break;
                case 8: // SALIR
                    System.out.println("\nSaliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion1 != 8);
        
        scanner1.close(); 
       
    }
    
    /**
     * Imprime en consola la información de una moneda.
     * @param moneda objeto de tipo {@link Moneda} cuya información se mostrará
     */
    
    //Actividad 6: punto 2 método que recibe un parámetro
  	public static void imprimirInformacionMoneda(Moneda moneda) {
  	    System.out.println("Polimorfismo - Info: " + moneda.obtenerInformacion());
  	}
  	
  	/**
  	 * Crea y devuelve un objeto {@link Moneda} de ejemplo con valores predefinidos.
  	 * @return una moneda de ejemplo
  	 */
  	  	
  	//Actividad 6: punto 2 método que retorna un tipo Moneda
  	public static Moneda crearMonedaEjemplo() {
  	    return new Conmemorativa("C002", "Cobre", "Pequeño", "1000", "Conmemorativa", "Común", "Moderna",
  	                             2022, true, new Protector("P002", "Metal", "Estuche"),
  	                             new Pais("MEX", "México"), false, "Aniversario");
  	}
  	
  //Campos vacios actividad 8
    public static String leerCampoObligatorio(Scanner scanner, String mensaje) {
        String entrada;
        do {
            System.out.print(mensaje);
            entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println(">> Este campo no puede estar vacío. Intente de nuevo.");
            }
        } while (entrada.isEmpty());
        return entrada;
    }

  	
}
