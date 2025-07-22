public class DataType {

    //Primitive Data Types
    
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(num);

        byte B = 127;
        System.out.println(B);

        short S = 29999;
        System.out.println(S);

        long L = 539767675;
        System.out.println(L);

        int I = 999999999;
        System.out.println(I);

        float F = 99999999989.67f; // f is required for float
        System.out.println(F);

        double D = 999999999999999.88888665;
        System.out.println(D);

        char C = 'C';

        boolean IsGood = true; 

        System.out.println(" ");
        
        System.out.println("Show output using String[] and Object[]. Its reduce multiple Print statement.");
        System.out.println(" ");
        String[] varNames = {"byte", "Short", "long", "int", "float", "double", "char", "Boolean"};
        Object[] varValues = {B, S, L, I, F, D, C, IsGood};

        for (int i=0; i< varNames.length; i++){
            System.out.println(varNames[i] + ":" + varValues[i] + "\t");

        }

    System.out.println(" ");

    }
}