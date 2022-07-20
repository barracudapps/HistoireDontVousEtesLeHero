/**
 * Détermine le déroulement d'un combat
 *
 * @LAMOTTE Pierre
 * @12-20-2015
 */
public class Combat{
    private String name;
    private String name2;
    private int ATK;
    private int DEF;
    private int portée;
    private int vie;
    private int ATK2;
    private int DEF2;
    private int portée2;
    private int vitesse;
    boolean vaincu=false;
    boolean mort=false;
    public Combat(String name,int ATK,int DEF,int portée,String name2,int vie,int ATK2,int DEF2,int portée2,int vitesse){
        System.out.println("Préparez-vous à vous affronter.");
        System.out.println();
        int vietmp=Histoire.getLifePoints();
        int distance=20;
        int answer;
        int round=1;
        this.name=name;
        this.name2=name2;
        this.ATK=ATK;
        this.DEF=DEF;
        this.portée=portée;
        this.vie=vie;
        this.ATK2=ATK2;
        this.DEF2=DEF2;
        this.portée2=portée2;
        this.vitesse=vitesse;
        while(vaincu==false&&mort==false){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                return;
            }
            System.out.println("Tour "+round+".");
            System.out.println(name2+" est à "+distance+"m de vous. Il vous reste "+vietmp+" points de vie.");
            System.out.println("Avancer de 1m (1)? Attaquer (2)? Attendre (3)?");
            answer=TextIO.getlnInt();
            System.out.println();
            if(answer==1){
                if(distance>1){
                    distance--;
                    System.out.println("Vous êtes désormais à "+distance+"m de "+name2+".");
                    System.out.println();
                }
                else{
                    System.out.println("Vous êtes  face à l'ennemi, vous ne pouvez plus avancer.");
                    System.out.println();
                }
            }
            else if(answer==2){
                if(distance<=portée){
                    System.out.println("Vous décidez d'attaquer l'ennemi.");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    if(DEF2>ATK){
                        System.out.println(name2+" a encaissé un coup mais n'a pas perdu de points de vie.");
                        DEF2-=ATK;
                        System.out.println();
                    }
                    else{
                        System.out.println(name2+" a perdu "+ATK+" points de vie car sa défense est trop faible.");
                        vie-=ATK;
                        System.out.println();
                        if(vie<=0){
                            vaincu=true;
                        }
                    }
                }
                else{
                    System.out.println("Votre adversaire est trop loin. Rien ne se passe.");
                    System.out.println();
                }
            }
            else if(answer==3){
                System.out.println("Vous passez votre tour...");
                System.out.println();
            }
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                return;
            }
            if(distance>1||distance>portée2){
                System.out.println(name2+" s'avance vers vous.");
                if(distance>vitesse){
                    distance-=vitesse;
                }
                else if(distance<=vitesse){
                    distance=1;
                }
                System.out.println();    
            }
            else if(distance<=portée2){
                System.out.println(name2+" vous attaque.");
                if(DEF>ATK2){
                    System.out.println("Vos protections permettent d'encaisser le coup.");
                    DEF-=ATK2;
                    System.out.println();
                }
                else{
                    System.out.println("Vos protections ne vous permettent pas de parer l'attaque...");
                    System.out.println("Vous perdez "+ATK2+" points de vie.");
                    vietmp-=ATK2;
                    System.out.println();
                    if(vietmp<=0){
                        mort=true;
                    }
                }
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                return;
            }
            round++;
        }
    }
}