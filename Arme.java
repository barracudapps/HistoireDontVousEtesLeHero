/**
 * Crée une nouvelle arme.
 *
 * @LAMOTTE Pierre
 * @12-19-2015
 */
public class Arme{
    private String name;
    private String description;
    private int ATK;
    private int DEF;
    private int portee;
    /**
     * Constructeur armes.
     */
    public Arme(String name,String description,int ATK,int DEF,int portee){
        this.name=name;
        this.description=description;
        this.ATK=ATK;
        this.DEF=DEF;
        this.portee=portee;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getATK(){
        return ATK;
    }
    public int getDEF(){
        return DEF;
    }
    public int getPortee(){
        return portee;
    }
}