package ej03;



import java.util.Map;

public class Opera {
        public char frecuencia(Map<Character, Integer> frecuencia) {
        char caractermasFrecuente = ' ';
        int maxFrecuencia = 0;
        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                caractermasFrecuente = entry.getKey();
            }
        }
        return caractermasFrecuente;
    }

    // Función para sustituir las vocales por el carácter más frecuente
    public String sustituirvocales(String texto, char sustituto) {
        return texto.replaceAll("[aeiouAEIOU]", String.valueOf(sustituto));
    }

    // Función para invertir el orden de las letras
    public String invertirorden(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
   
}