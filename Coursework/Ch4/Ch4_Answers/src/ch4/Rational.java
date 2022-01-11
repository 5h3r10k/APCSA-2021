package ch4;

public class Rational {
    
    // data members

    private boolean defined;
    private int p;
    private int q;


    // constructors

    public Rational(){
        this.p = 1;
        this.q = 1;

        reduce();
    }

    public Rational(double num){
        int x = deciToFracHelper(num);
        this.p = (int)(num*Math.pow(10, x));
        this.q = (int)(Math.pow(10, x));

        reduce();
    }

    public Rational(double num,double denom){

        int nump, numq, denomp, denomq;

        int x = deciToFracHelper(num);
        nump = (int)(num*Math.pow(10, x));
        numq = (int)(Math.pow(10, x));

        x = deciToFracHelper(denom);
        denomp = (int)(denom*Math.pow(10, x));
        denomq = (int)(Math.pow(10, x));

        this.p = nump*denomq;
        this.q = denomp*numq;

        reduce();

    }

    public Rational(int num,int denom){
        
        this.p = num;
        this.q = denom;

        reduce();
    }


    // toString

    public String toString(){
        return this.p + "/" + this.q;
    }


    // getters-setters

    public int getP() {
        return this.p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return this.q;
    }

    public void setQ(int q) {
        this.q = q;
    }


    // helpers

    private int deciToFracHelper(double x) {
        int n=0;

        while((int)x!=x){
            x*=10;
            n++;
        }

        return n;
    }

    private int gcf(int n1,int n2){
        
        for(int i=Math.min(n1, n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }

        return -1;
    }

    public void reduce(){
        
        int f = gcf(this.p, this.q);

        this.p /= f;
        this.q /= f; 

    }


    // other returns

    public boolean isDefined(){
        defined = this.q!=0;
        return defined;
    }

    public double decimalValue(){
        return (double)this.p / this.q;
    }

    public boolean equals(Rational other){
        return this.decimalValue()==other.decimalValue();
    }


    // operations with Rationals

    public Rational add(Rational other){
        this.p = this.p*other.q + this.q*other.p;
        this.q*=other.q;
        reduce();
        return this;
    }

    public Rational subtract(Rational other){
        this.p = this.p*other.q - this.q*other.p;
        this.q*=other.q;
        reduce();
        return this;
    }

    public Rational multiply(Rational other){
        this.p*=other.p;
        this.q*=other.q;
        reduce();
        return this;
    }

    public Rational divide(Rational other){
        this.p*=other.q;
        this.q*=other.p;
        reduce();
        return this;
    }

}
