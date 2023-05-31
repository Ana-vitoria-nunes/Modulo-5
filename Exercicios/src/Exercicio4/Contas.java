package Exercicio4;

public class Contas implements Tributos{

    private double saldoPoupanca;
    private double saldoSeguroVida;
    private double saldoCorrente;

    public Contas(double saldoPoupanca,double saldoCorrente, double saldoSeguroVida) {
        this.saldoPoupanca = saldoPoupanca;
        this.saldoSeguroVida = saldoSeguroVida;
        this.saldoCorrente = saldoCorrente;
    }
    @Override
    public double tributoPoupanca() {
        return saldoPoupanca;
    }

    @Override
    public double tributoSeguroVida() {
        return saldoSeguroVida+42;
    }

    @Override
    public double tributoCorrente() {
        return (saldoCorrente*0.01)+saldoCorrente;
    }
}
