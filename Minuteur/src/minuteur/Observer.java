package minuteur;

public class Observer {




    public void NotiferTout()
    {
        Minuteur.setChanges();
        AffichageComplet.setChanges();
    }
}
