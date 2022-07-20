/**
 * Histoire principale au long de laquelle le personnage évolue.
 *
 * @LAMOTTE Pierre
 * @12-19-2015
 */
public class Histoire{
    public static int lifePoints;
    /**
     * Constructeur d'objets de classe Histoire
     */
    public void main(){
        boolean fini=false;
        int réponse;
        lifePoints=50;
        Arme arme=new Arme("","",0,0,0);
        int ATK=0;
        int DEF=0;
        String name;
        while(fini!=true&&lifePoints>0){
            System.out.println("-\"Bonjour à toi, étranger. Bienvenue à Asgard ! Comment t'appelles-tu ?\"");
            name=TextIO.getlnString();
            System.out.println();
            System.out.println("-\"Enchanté "+name+". Je suis Thor, fils d'Ödin. Je serai ton guide lors de ta formation.");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                return;
            }
            System.out.println(" Suis-moi, je vais te montrer deux ou trois choses utiles...\"");
            System.out.println();
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                return;
            }
            System.out.println("Pour suivre Thor, entrez \"1\". Pour quitter, entrez \"2\".");
            réponse=TextIO.getlnInt();
            System.out.println();
            if(réponse==2){
                fini=true;
            }
            else{
                System.out.println("-\"Nous voici dans la plus grande forteresse du Royaume des Ases.");
                System.out.println(" C'est ici que va commencer ta formation. Entrons dans la salle d'armes pour t'équiper\"");
                System.out.println();
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    return;
                }
                System.out.println("Pour entrer dans la salle d'armes, entrez \"1\". Pour arrêter l'aventure à ce stade,");
                System.out.println("entrez \"2\"");
                réponse=TextIO.getlnInt();
                System.out.println();
                if(réponse==2){
                    fini=true;
                }
                else{
                    System.out.println("-\"Nous voici dans la plus grande armurerie jamais construite dans les Neuf Mondes.");
                    System.out.println(" Au fait, sais-tu ce que sont les Neuf Mondes ?\"");
                    try{
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println();
                    System.out.println("Si vous voulez en savoir plus sur les Neuf Mondes, entrez \"1\". Sinon, \"2\"");
                    réponse=TextIO.getlnInt();
                    System.out.println();
                    if(réponse==1){
                        System.out.println("-\"L'univers est composé de neuf mondes dans lesquels vivent différentes créatures.");
                        System.out.println(" Le monde dans lequel tu vis s'appelle \"Midgard\" et est peuplé d'êtres que tu croises");
                        System.out.println(" au quoitidien.");
                        try{
                            Thread.sleep(5000);
                        }
                        catch(InterruptedException e){
                            return;
                        }
                        System.out.println(" Le second monde dont je vais te parler s'appelle \"Asgard\". C'est le monde dans");
                        System.out.println(" lequel tu es actuellement. C'est là que vivent les dieux.");
                        try{
                            Thread.sleep(5000);
                        }
                        catch(InterruptedException e){
                            return;
                        }
                        System.out.println(" Il y a également Jötunheim, le Royaume des Géants des Glaces, Lightalfheim, où");
                        System.out.println(" vivent les Elfes, Niflheim, monde des brumes, Muspellheim, terre de feu gardée");
                        System.out.println(" par Surt, Vanaheim, là où les Vanes vivent et, les deux derniers, Svartalfheim,");
                        System.out.println(" royaume des nains, et Helheim, monde des morts.");
                        try{
                            Thread.sleep(15000);
                        }
                        catch(InterruptedException e){
                            return;
                        }
                        System.out.println(" Tu en sauras plus sur ces mondes au moment voulu.");
                    }
                    else{
                        System.out.println("-\"Très bien, je vois que tu t'es renseigné.");
                    }
                    try{
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println(" Avant de commencer ton entrainement, nous devons t'équiper.");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println(" Quelle arme choisis-tu pour commencer l'exercice ?\"");
                    System.out.println();
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println("Thor vous montre 3 armes. La première est un arc, la seconde est un marteau de guerre");
                    System.out.println("et la troisième arme est un glaive.");
                    System.out.println("L'arc possède une portée de 6m, une puissance d'attaque de 5 et une défence de 1.");
                    System.out.println("Le marteau a une portée de 1m, une puissance de 8 et une défense de 3.");
                    System.out.println("Le glaive porte des coups à 2m avec une puissance 7 et une défense 2.");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println("Pour sélectionner l'arc, insérez \"1\". Pour le marteau de guerre, \"2\". Pour le glaive \"3\".");
                    réponse=TextIO.getlnInt();
                    System.out.println();
                    if(réponse==1){
                        String descr="Possède une portée de 6m, une puissance d'attaque de 5 et une défence de 1.";
                        arme=new Arme("l'arc",descr,5,1,6);
                        ATK+=5;
                        DEF+=1;
                        System.out.println("Vous avez choisi l'arc.");
                        System.out.println("Après plusieurs heures d'entrainement vous maîtrisez votre première arme: "+arme.getName()+".");
                    }
                    else if(réponse==2){
                        String descr="Possède une portée de 1m, une puissance de 8 et une défense de 3.";
                        arme=new Arme("le marteau de guerre",descr,8,3,1);
                        ATK+=8;
                        DEF+=3;
                        System.out.println("Vous avez choisi le marteau de guerre.");
                        System.out.println("Après plusieurs heures d'entrainement vous maîtrisez votre première arme: "+arme.getName()+".");
                    }
                    else if(réponse==3){
                        String descr="Porte des coups à 2m avec une puissance 7 et une défense 2.";
                        arme=new Arme("le glaive",descr,7,2,2);
                        ATK+=7;
                        DEF+=2;
                        System.out.println("Vous avez choisi le glaive.");
                        System.out.println("Après plusieurs heures d'entrainement vous maîtrisez votre première arme: "+arme.getName()+".");
                    }
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        return;
                    }
                    System.out.println();
                    System.out.println("-\"Maintenant, il est temps pour toi d'aller te reposer car le labeur est loin d'être fini.\"");
                    System.out.println();
                    System.out.println("Pour continuer, entrez \"1\". Pour quitter, entrez \"2\"");
                    réponse=TextIO.getlnInt();
                    System.out.println();
                    if(réponse==2){
                        fini=true;
                    }
                    else{
                        System.out.println("Au réveil, Thor vous annonce que vous êtes prêt pour votre première mission...");
                        System.out.println();
                        try{
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e){
                            return;
                        }
                        System.out.println("-\"Bonjour "+name+". J'espère que tu as repris des forces car j'ai une mission");
                        System.out.println(" à te confier.\"");
                        System.out.println();
                        System.out.println("Accepter la mission ? Si oui, insérez \"1\". Dans le cas contraire, \"2\"");
                        réponse=TextIO.getlnInt();
                        System.out.println();
                        if(réponse==2){
                            fini=true;
                        }
                        else{
                            System.out.println("-\"Excellent ! Je ne m'attendais pas à moins de ta part. Tu vas devoir recueillir une dent");
                            System.out.println(" de Nidhögg afin de créer une tête de lance. Cette dent permettra à la lance d'atteindre");
                            System.out.println(" une cible avec une puissance extraordinaire.");
                            try{
                                Thread.sleep(5000);
                            }
                            catch(InterruptedException e){
                                return;
                            }
                            System.out.println(" J'espère de tout coeur te revoir bientôt avec cette dent. D'autres quêtes");
                            System.out.println(" viendront par la suite...\"");
                            System.out.println();
                            try{
                                Thread.sleep(5000);
                            }
                            catch(InterruptedException e){
                                return;
                            }
                            System.out.println("Après quelques préparations, vous partez à l'aventure avec votre arme: "+arme.getName()+".");
                            try{
                                Thread.sleep(2000);
                            }
                            catch(InterruptedException e){
                                return;
                            }
                            System.out.println("Avant de partir, Loki, le frère de Thor s'avance vers vous et vous offre un casque, ce qui augmente");
                            System.out.println("votre défense de 2.");
                            Items casque=new Items("casque","Protège le visage de son porteur et augmente sa défense de 2",0);
                            try{
                                Thread.sleep(2000);
                            }
                            catch(InterruptedException e){
                                return;
                            }
                            DEF+=2;
                            System.out.println("Vous voici désormais prêt pour partir en direction des racines de l'Yggdrasil....");
                            System.out.println("L'Yggdrasil est l'arbre qui porte les Neuf Mondes. Ses racines prenent source dans trois Mondes.");
                            System.out.println("C'est à la première racine que vous devez vous rendre. Sur Niflheim. C'est là que loge");
                            System.out.println("Nidhögg.");
                            try{
                                Thread.sleep(5000);
                            }
                            catch(InterruptedException e){
                                return;
                            }
                            System.out.println("Pour y parvenir, vous vous rendez au Bifrost, le pont arc-en-ciel. Celui-ci vous permet");
                            System.out.println("de vous rendre sur n'importe quel Monde.");
                            System.out.println("Souhaitez-vous commencer la quête en entrant \"1\" ? Ou préférez-vous attendre en entrant \"2\" ?");
                            réponse=TextIO.getlnInt();
                            System.out.println();
                            if(réponse==2){
                                System.out.println("Malheureusement, l'aventure s'achève ici pour toi... Retente ta chance !");
                                System.out.println();
                                fini=true;
                            }
                            else{
                                System.out.println("En route donc !");
                                try{
                                    Thread.sleep(2000);
                                }
                                catch(InterruptedException e){
                                    return;
                                }
                                System.out.println();
                                System.out.println("Vous voici arrivé sur Niflheim. Vous devez vous diriger vers la source Hvergelmir. C'est là");
                                System.out.println("que Nidhögg ronge une des trois racines de l'Yggdrasil.");
                                try{
                                    Thread.sleep(2000);
                                }
                                catch(InterruptedException e){
                                    return;
                                }
                                System.out.println("En face de vous s'offrent 3 chemins. Lequel voulez-vous arpenter ? \"1\", \"2\" ou \"3\" ?");
                                réponse=TextIO.getlnInt();
                                System.out.println();
                                if(réponse==1){
                                    System.out.println("Après plusieurs jours de marche, vous tombez face à un précipice.");
                                    try{
                                        Thread.sleep(2000);
                                    }
                                    catch(InterruptedException e){
                                        return;
                                    }
                                    System.out.println("Vous voulez faire demi-tour mais le rocher sur lequel vous vous trouvez se brise et vous");
                                    System.out.println("emporte dans sa chute.");
                                    System.out.println();
                                    System.out.println("[LifePoints -200]");
                                    lifePoints-=200;
                                    System.out.println();
                                }
                                else if(réponse==2){
                                    System.out.println("Vous empruntez le second sentier. Après deux longues heures de marche à travers la brume,");
                                    System.out.println("vous percevez un bruit.");
                                    try{
                                        Thread.sleep(2000);
                                    }
                                    catch(InterruptedException e){
                                        return;
                                    }
                                    System.out.println("Il s'agit d'un cavalier viking, mort de la Peste Noire. Il s'approche et vous dit:");
                                    System.out.println();
                                    System.out.println("-\"Hvem er du ?\"");
                                    System.out.println();
                                    try{
                                        Thread.sleep(2000);
                                    }
                                    catch(InterruptedException e){
                                        return;
                                    }
                                    System.out.println("Répondez-lui.");
                                    String rép=TextIO.getlnString();
                                    System.out.println();
                                    if(rép!=name){
                                        System.out.println("Vous ne parlez visiblement pas Norvégien. Il vous demandait votre nom.");
                                        try{
                                            Thread.sleep(1000);
                                        }
                                        catch(InterruptedException e){
                                            return;
                                        }
                                        System.out.println("N'ayant pas répondu correctement, il amorce le combat.");
                                        System.out.println();
                                        try{
                                            Thread.sleep(2000);
                                        }
                                        catch(InterruptedException e){
                                            return;
                                        }
                                        Combat combat=new Combat(name,ATK,DEF,arme.getPortee(),"Cavalier Mort",10,4,4,2,3);
                                        if(combat.vaincu==true){
                                            System.out.println("Vous avez vaincu Cavalier Mort.");
                                            System.out.println();
                                        }
                                        else if(combat.mort==true){
                                            System.out.println("Vous avez péri au combat...");
                                            System.out.println();
                                            fini=true;
                                        }
                                    }
                                    else if(rép==name){
                                        System.out.println("Parfait ! Vous avez dû suivre des cours de Norvégien car il s'en va paisiblement.");
                                        try{
                                            Thread.sleep(1000);
                                        }
                                        catch(InterruptedException e){
                                            return;
                                        }
                                        //A continuer.
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Malheureusement, l'aventure s'achève ici pour toi... Retente ta chance !");
        System.out.println();
    }
    public static int getLifePoints(){
        return lifePoints;
    }
}