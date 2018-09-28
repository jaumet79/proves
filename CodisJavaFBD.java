// calcular temps inici final de mètode --------------------------------------------
long time_start = System.currentTimeMillis();
long time_end = System.currentTimeMillis();
System.out.println("the task has taken " + (time_end - time_start) + " milliseconds");

// Obtener role --------------------------------------------
sessionBeanPrecode.getRole()

// Guardar log --------------------------------------------
String logCambios = null;
boolean exito = false;

logCambios = (resultado.isEmpty() ? "0" : resultado.size()) + " resultats";
logCambios = errors.toString();

finally {
	String parametros = "cicloVida$=" + cicloVida + "$#valorador$=" + valorador + "$#listaCodigosPostales$=" + listaCodigosPostales;
	saveLogEJB("loadPendientesValoracion", parametros, logCambios, 0, AccionEJB.CICLO_VIDA_CARGAR_TODOS_PENDIENTES_VALORACION, exito, sp);
}

// Object to xml ---------------------------------------------------------
	<dependency>
		<groupId>com.fasterxml.jackson.dataformat</groupId>
		<artifactId>jackson-dataformat-xml</artifactId>
		<version>2.9.4</version>
	</dependency>
	<dependency>
		<groupId>org.codehaus.woodstox</groupId>
		<artifactId>woodstox-core-asl</artifactId>
		<version>4.1.4</version>
	</dependency>

com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
xmlMapper.enable(com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT);
xmlMapper.writeValue(new java.io.File("H:\\output.xml"), listaOcupacionDTO);
