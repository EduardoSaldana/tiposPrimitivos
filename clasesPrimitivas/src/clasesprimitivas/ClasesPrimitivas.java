



package clasesprimitivas;




public class ClasesPrimitivas {
    
/*
  * Enteros:
        - byte: 8 bits(-128 a 127) | Byte.MIN_VALUE - MAX_VALUE
        - short: 16 bits (-32768 a 32767) | Short.MIN_VALUE - MAX_VALUE
        - int:
        - long;
    
  * Decimales:
        - Float:
        - Double:
    
  * Caracter:
        - Char:
    
*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tipos Enteros: ");
        Byte enterobyte = 0;
        System.out.println("enteroByte = " + enterobyte);
        System.out.println("Valor mínimo del tipo byte: "+Byte.MIN_VALUE);
        System.out.println("Valor máximo del tipo byte: "+Byte.MAX_VALUE);
        
        
        Short enteroshort = 0;
        System.out.println("\nenteroShort = " + enteroshort);
        System.out.println("Valor mínimo del tipo short: "+Short.MIN_VALUE);
        System.out.println("Valor máximo del tipo short: "+Short.MAX_VALUE);
        
        
        Integer enteroInt = 35000;
        System.out.println("\nenteroInteger = " + 5);
        System.out.println("Valor mínimo del tipo int: "+Integer.MIN_VALUE);
        System.out.println("Valor máximo del tipo int: "+Integer.MAX_VALUE);
        

        System.out.println("\nenteroLong");
        System.out.println("Valor mínimo del tipo long: "+Long.MIN_VALUE);
        System.out.println("Valor máximo del tipo longshort: "+Long.MAX_VALUE);
        
        
        System.out.println("");
        System.out.println("\nTipos Decimales: ");
        
        System.out.println("decimalFloat ");
        System.out.println("Valor mínimo del tipo float: "+Float.MIN_VALUE+ "\nValor Máximo del tipo float: "+Float.MAX_VALUE);
        System.out.println("\ndecimalDouble ");
        System.out.println("Valor mínimo del tipo double: "+Double.MIN_VALUE+ "\nValor Máximo del tipo double: "+Double.MAX_VALUE);
        System.out.println("decimalCaracter ");
        System.out.println("Valor mínimo del tipo char: "+Character.MIN_VALUE+ "\nValor Máximo del tipo char: "+Character.MAX_VALUE);
        

        
        
    }
    
}
