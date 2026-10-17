package metier;

import dao.DaoIMP;
import dao.IDao;

public class MetierIMP implements IMetier{
    private IDao dao;
    public double calcule(){
        double val= dao.getvalue();
        return 7*val;

    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
