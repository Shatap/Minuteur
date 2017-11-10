/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuteur;

import java.util.Observable;

/**
 *
 * @author ytricha
 */
public class MinuteurModele extends Observable{
    public static  int MAX_HEURE = 24;
    public  static  int MAX_MINSEC = 60 ;

    int minute;
    int heure;
    int seconde;
    public   MinuteurModele(int a, int b ,int c)
    {
        this.heure = a;
        this.minute=b;
        this.seconde = c;
    }
    public int getHeure(){return heure;}

    public int getMinute(){
        return minute;
    }

    public int getSeconde()
    {
        return seconde;
    }
    public void setHeure(int h)
    {
        this.heure = h;
        setChanged();
        notifyObservers();
    }

    public void setMinute(int m)
    {
        this.minute = m;
        setChanged();
        notifyObservers();
    }

    public void setSeconde(int s)
    {
        this.seconde=s;
        setChanged();
        notifyObservers();
    }
}
