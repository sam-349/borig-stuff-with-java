class Baisc{
    static int i;
    static long l;    
    static char ch;
    static String str; 
    static float f;
    static double d;    
    // if variables declared inside the main then program gives an error
    // error: variable ** might not have been initialized. ** represents variable name.
    public static void main(String args[]){
        System.out.println("Integer: "+i);
        System.out.println("Long: "+l);
        System.out.println("char: "+ch);
        System.out.println("String: "+str);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
    }
}
