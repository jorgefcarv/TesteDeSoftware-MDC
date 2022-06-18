public class MathUtil {
    public static double mdc(double a, double b){
        //P7
        a = Math.abs(a);
        b = Math.abs(b);

        //P6
        final double min = Math.min(a,b);
        a = Math.max(a,b);
        b = min;

        //P1 E P2
        if (b > 0 && a % b == 0) {
            return b;
        }

        //P3
        if( b == 0) {
            return Math.abs(a);
        }


        return mdc(a-b, b);
    }

    public static double mdc(double ...valores){
        double a = valores[0];
        /*for (int i = 1; i < valores.length; i++) {
            final double b = valores[i];
            a = mdc(a,b);
        }*/
        for (final double b : valores) {
            a = mdc(a,b);

        }
        return a;
    }
}
