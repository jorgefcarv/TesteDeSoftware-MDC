import java.util.Objects;

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
        Objects.requireNonNull(valores, "O valor não pode ser nulo");
        if(valores.length == 0){
            throw new IllegalArgumentException("Indique pelo menos 1 número para calcular o mdc");
        }

        double a = valores[0];
        for (double b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
}
