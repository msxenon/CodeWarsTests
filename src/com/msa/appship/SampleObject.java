package com.msa.appship;

public class SampleObject   {
    private int id;
    public SampleObject(int id){
        this.id = id;
    }
    @Override
    public int hashCode() {
        return (int) ((System.currentTimeMillis()/2)*0.5);
    }

    @Override
    public boolean equals(Object obj) {
         return ((SampleObject) obj).id == this.id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new SampleObject(this.id);
    }

    @Override
    public String toString() {
        return "SampleObject: {id : "+this.id+" }";
    }


}
