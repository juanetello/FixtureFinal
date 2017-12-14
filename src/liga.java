/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanet
 */
public class liga {
    
}
/*
*
public void liga(){
   
   int tope=15
;//modificar el numero de clubes
   ArrayList <String> clubes=new ArrayList<String>();
   for (int i=0; i<tope;i++){
      clubes.add("Club_"+Integer.toString(i));
   }
   int auxT=clubes.size();
   boolean impar=(auxT%2!=0);
   if(impar){
      ++auxT;
   }
   int totalP=(auxT*(auxT-1))/2;//total de partidos de una ronda
   String [] local=new String [totalP];
   String [] visita=new String [totalP];
   int modIF=(auxT/2);//para hacer mod cada inicio de fecha
   int indiceInverso=auxT-2;
   for(int i=0;i<totalP;i++){
      if (i%modIF==0){//seria el partido inicial de cada fecha
         //si es impar el numero de clubes la primera fecha se borra poniendo null
         if (impar){
            local[i]=null;
            visita[i]=null;
         }
         else{
            //se pone uno local otro  visita al ultimo equipo
            if(i%2==0){
               local[i]=clubes.get(i%(auxT-1));
               visita[i]=clubes.get(auxT-1);
            }
            else{
               local[i]=clubes.get(auxT-1);
                visita[i]=clubes.get(i%(auxT-1));
            }
         }
      }
      else{
         local[i]=clubes.get(i%(auxT-1));
         visita[i]=clubes.get(indiceInverso);           
         --indiceInverso;
         if (indiceInverso<0){
            indiceInverso=auxT-2;
         }
      }
   }
   for(int i=0;i<totalP;i++){
      if(local[i]!=null){
         System.out.println(local[i]+" vs "+visita[i]+"\n");
      }
   }
   System.out.println("\n Segunda ronda \n \n");
   for(int i=0;i<totalP;i++){
      if(local[i]!=null){
         System.out.println(visita[i]+" vs "+local[i]+"\n");
      }
   }
}
*/