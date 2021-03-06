package by.it.lasotskaya.calc;

class Scalar extends Var {

    private  double value;

    public double getValue() {
        return value;
    }
    Scalar (double value){

        this.value=value;
    }

    @Override
    public Var add (Var other) throws CalcException{
        if (other instanceof Scalar){
            double res=this.value+((Scalar)other).value;
            return new Scalar(res);
        }
        else return  other.add(this);
    }

    @Override
    public Var sub (Var other) throws CalcException{
        if (other instanceof Scalar){
            double sub=this.value-((Scalar)other).value;
            return  new Scalar(sub);
        }
        else return  new Scalar(-1).mul(other).add(this);
    }

    @Override
    public Var mul (Var other) throws CalcException {
        if (other instanceof Scalar){
            double mul=this.value * ((Scalar)other).value;
            return  new Scalar(mul);
        }
        else return  other.mul(this);
    }

    @Override
    public Var div (Var other) throws CalcException {
        if (other instanceof Scalar){
            if (((Scalar) other).value==0)
                throw new CalcException("Деление на ноль");

            double div=this.value / ((Scalar)other).value;
            return new Scalar(div);
        }
        if (other instanceof Vector){
            throw new CalcException("Деление на вектор невозможно");
        }
        return  super.div(other);
    }



    Scalar (String str){
        value=Double.parseDouble(str);
    }

    Scalar (Scalar otherScalar){
        this.value=otherScalar.value;
    }
    @Override
    public String toString() {
        return  Double.toString(value);
    }


}