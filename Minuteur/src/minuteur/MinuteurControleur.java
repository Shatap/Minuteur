
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuteur;

/**
 *
 * @author ytricha
 */
public class MinuteurControleur {
    
   MinuteurModele minuteur;
    
 public  MinuteurControleur(MinuteurModele m)
    {
        minuteur = m;
        this.setHeure(m.heure);
        this.setMinute(m.minute);
        this.setSeconde(m.seconde);
    }
 
    public void   setHeure(int h)
    {
        if(minuteur.getHeure() + h < 23)
        minuteur.setHeure(h);
        
        if(minuteur.getHeure() + h > 23)
            minuteur.setHeure((minuteur.getHeure()+h) -23);
    }
    
    public void setMinute(int min)
    {
        minuteur.setMinute(min);
    }
    
    public void setSeconde(int s)
    {
     minuteur.setSeconde(s);
    
    }
    
    public void incHeure(int h)
    {
    
        if(minuteur.getHeure()+h < 23)
                minuteur.setHeure(minuteur.getHeure()+h);
        if(minuteur.getHeure()+h > 23)
            minuteur.setHeure((minuteur.getHeure()+h)-23);
        
        //        minuteur.setHeure(0);            
        
    }
    
    public void incMinute(int min)
    {
        minuteur.setMinute(minuteur.getMinute()+min);
        if(minuteur.getMinute() > 59)
        {
            minuteur.setMinute(1);
            incHeure(1);
        }
    }
    
    public void  incSeconde(int s)
    {
       
        minuteur.setSeconde(minuteur.getSeconde()+s);
        
        if(minuteur.getSeconde()==59)
        {
            incMinute(1);
        }   
    }
}

