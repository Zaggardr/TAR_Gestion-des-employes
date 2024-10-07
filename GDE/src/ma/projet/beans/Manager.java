
package ma.projet.beans;


public class Manager extends Personne {

    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }

    public Manager(int id, String nom, double salaire) {
        super(id, nom, salaire);
    }
     @Override
    public String toString(){
        return getClass().getSimpleName()+ super.toString();
    
    }
    
}
