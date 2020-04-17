package guru.springframework;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression times(int multiplier);

    public Expression plus(Expression addend);
}
