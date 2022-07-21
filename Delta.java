package aula7;

import aula7.Equacao;

public class Delta extends Equacao {
    
    private double delta;
    //#region metodo de acesso
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    //#endregion

    //#region regras de negócio
    public void calculaDelta() {
        delta = Math.pow(super.getB(), 2);
        delta = delta - 4 * super.getA() * super.getC();
    }

    //#endregion
}
