package equalshashcodelesson;

public class Multiple {
    private Integer a;
    private Integer b;
    private Integer multiple;

    public Multiple(Integer a, Integer b){
        this.a = a;
        this.b = b;
        this.multiple = a*b;
    }

    public void setA (Integer a){
        this.a = a;
    }
    public Integer getA (){
        return this.a;
    }
    public void setB (Integer b){
        this.b = b;
    }
    public Integer getB (){
        return this.b;
    }
    public void setMultiple (Integer multiple){
        this.multiple = multiple;
    }
    public Integer getMultiple (){
        return this.multiple;
    }

    @Override
    public String toString (){
        return "A = " + this.a + " * B = " + this.b + " === " + this.multiple;
    }

    @Override
    public boolean equals (Object object){
        if (object == this) return true;
        if (object instanceof Multiple){
            return (((Multiple) object).getMultiple() == this.getMultiple());
        }
        return false;
    }
}
