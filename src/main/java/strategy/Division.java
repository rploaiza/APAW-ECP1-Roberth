package strategy;

public class Division implements Expresion {

    @Override
    public int exprecion(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
