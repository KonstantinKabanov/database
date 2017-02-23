/**
 * Created by Костя on 23.02.2017.
 */
public class Product {
    private int id;
    private String name;
    private String number;

    public Product(){}
    public Product(int id, String name, String number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return "Product: ("+id+name+number+")";
    }
}
