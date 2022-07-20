/**
 * Crée de nouveaux objets
 *
 * @LAMOTTE Pierre
 * @12-19-2015
 */
public class Items{
    private String name;
    private String description;
    private int power;
    /**
     * Constructeur d'objets.
     */
    public Items(String name,String description,int power){
        this.name=name;
        this.description=description;
        this.power=power;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getPower(){
        return power;
    }
}