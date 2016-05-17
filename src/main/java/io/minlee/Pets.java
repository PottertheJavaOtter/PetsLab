package io.minlee;

/**
 * Created by minlee on 5/4/16.
 */
abstract class Pets {

    private String name;

    public Pets(String name){
        this.name = name;
    }
    public String speak(){
        return "";
    }
    public Object eat(Object object){
        return null;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
