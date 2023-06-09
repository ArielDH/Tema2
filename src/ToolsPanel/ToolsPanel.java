package ToolsPanel;

import javax.swing.JOptionPane;


public class ToolsPanel {
	public static byte leerByte(String msje){
        return(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura Byte",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static int leerInt(String msje){
        return(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura Int",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static String leerString(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura String",JOptionPane.QUESTION_MESSAGE));
    }
    
    public static float leerFloat(String msje){
        return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura Float",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static char leerChar(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura Char",JOptionPane.QUESTION_MESSAGE).charAt(0));
    }
    
    public static short leerShort(String msje){
        return(Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura Short",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static double leerDouble(String msje){
        return(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura Double",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static long leerLong(String msje){
        return(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura Long",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static void imprime(String msje){
        JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void imprimeErrorMsje(String msje) {
    	JOptionPane.showMessageDialog(null,msje,"Error¡¡¡",JOptionPane.ERROR_MESSAGE);
    }
    public static int Sino() {
    	return JOptionPane.showConfirmDialog(null,"Deseas continuar?","Capturando datos",JOptionPane.YES_NO_OPTION);
    }
    public static String  Carrera() {
String valores[] = { "Ing. En Sistemas", "Ing. Informatica" };
return ((String) JOptionPane.showInputDialog(null, "seleciona", "tu carrera", JOptionPane.QUESTION_MESSAGE, null,
valores, valores[0]));
}

    public static byte Semestre(){
        String valores[] = { "1","2","3","4","5","6","7","8","9","10","11","12" };
        return Byte.parseByte((String)JOptionPane.showInputDialog(null,"Selecciona ","Semestre",JOptionPane.QUESTION_MESSAGE, null,valores,valores[0]));
    }
    public static String boton(String menu) {
    	String valores[]=menu.split(",");
    	int n;
    	n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", 
    	JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, valores,valores[0]); 
    	return ( valores[n]);
    	}
}
