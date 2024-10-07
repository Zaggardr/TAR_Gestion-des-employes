
package ma.projet.test;

import ma.projet.beans.Developpeur;
import ma.projet.beans.DirecteurGeneral;
import ma.projet.beans.Manager;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;


public class Entreprise {

    public static void main(String[] args) {

        DeveloppeurService ds = new DeveloppeurService();
        ManagerService ms = new ManagerService();
        
       
//        ds.create(new Developpeur("SEBIHI", 8000));
//        ds.create(new Developpeur("NOUARI", 8000));
//        ms.create(new Manager("SADDIK", 9000));
//        ds.create(new Developpeur("AMALI", 8500));
//        ms.create(new DirecteurGeneral("RAMI", 10000));
        System.out.println(ds.getAll());
        System.out.println(ms.getAll());

    }

}
