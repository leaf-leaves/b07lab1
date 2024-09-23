public class Polynomial{
    double[] coeff;

    public Polynomial(){
        coeff = new double[1];
    }

    public Polynomial(double[] set){
        coeff = set;
    }

    public Polynomial add(Polynomial input){
        int newlength = Math.max(input.coeff.length,this.coeff.length);
        double temp[] = new double[newlength];
        Polynomial newcoeff = new Polynomial(temp);
        for (int i = 0; i < newlength; i++){
            if (i<input.coeff.length){
                newcoeff.coeff[i] += input.coeff[i];
            }
            if (i<this.coeff.length){
                newcoeff.coeff[i] += this.coeff[i];
            }
        }
        return newcoeff;
    }

    public double evaluate(double x){
        double y=0;
        for (int i = 0; i < this.coeff.length; i++){
            y += this.coeff[i]*Math.pow(x,i);
        }
        return y;
    }

    public boolean hasRoot(double x){
        return Math.abs(evaluate(x)) < 1e-9;
    }
}