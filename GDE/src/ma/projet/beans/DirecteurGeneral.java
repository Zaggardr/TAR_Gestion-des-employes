
package ma.projet.beans;


public class DirecteurGeneral extends Manager {

    public DirecteurGeneral(String nom, double salaire) {
        super(nom, salaire);
    }

    public DirecteurGeneral(int id, String nom, double salaire) {
        super(id, nom, salaire);
    }
     @Override
    public String toString(){
        return getClass().getSimpleName()+ super.toString();
    
    }

}
