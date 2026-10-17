package presentation;


import dao.DaoIMP;
import dao.IDao;
import metier.IMetier;
import metier.MetierIMP;

public class PresentationStatique {
    public static void main(String[] args) {

     IDao dao=  new DaoIMP();
     MetierIMP Metier=new MetierIMP();

    //injection de dépendances
        Metier.setDao(dao);
        System.out.println(Metier.calcule());

    }}
