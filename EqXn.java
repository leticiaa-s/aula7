package aula7;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    //#region inicio do método de acesso
    public double getXn() {
        return xn;
    }
    public void setXn(double xn) {
        this.xn = xn;
    }
    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    //#endregion

    //#region Regras de negócio
    public double calculaXn (Delta delta) {
        xn = (- delta.getB() - Math.sqrt(delta.getDelta()));
        return xn / (2 * delta.getA());
    }

    public double calculaXp (Delta delta) {
        xp = (- delta.getB() + Math.sqrt(delta.getDelta()));
        return xp / (2 * delta.getA());
    }

    //#endregion
}
