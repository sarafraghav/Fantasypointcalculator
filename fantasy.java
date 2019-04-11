import java.io.*;
import java.util.*;
 

 class fantasy{
 	public static void main(String[]args){
 		/*PLAYER----------------------------------------------------PLAYER--------------------------------------------------PLAYER---------------------------------------PLAYER----------------------------------PLAYER-----------------------PLAYER*/
 		/**/





  /**/


        BufferedReader br = null;
         try {
                     int dt = 1, dg = 3,da = 2 , ds = 1 , dog = -3;
         int gsh = 2 , ga = 3 , gs = 1 , gg = 5 , gog = -4 , gt = 2 ; 
         int mt = 1 , ma = 2 , ms =1 , mg = 3 , mog = -3;
         int st = 1, sa = 2 , ss =1 , sg = 3 , sog = -5 ;
         int yc = -2 , rc = -5;
       

        String ppf = "playerpoints.csv";
        DataInputStream ppfdis;
        FileInputStream ppffis = new FileInputStream(ppf);
        ppfdis = new DataInputStream(ppffis);
        String ppfline;
        HashMap<String,String>  namefinder = new  HashMap<String,String>();
        HashMap<ArrayList<Integer>,String> goalkeeper = new HashMap<ArrayList<Integer>,String>();
        HashMap<ArrayList<Integer>,String> mid = new HashMap<ArrayList<Integer>,String>();
        HashMap<ArrayList<Integer>,String> def = new HashMap<ArrayList<Integer>,String>();
        HashMap<ArrayList<Integer>,String> striker = new HashMap<ArrayList<Integer>,String>();
         HashMap<String,Integer> app = new HashMap<String,Integer>();

        while((ppfline = ppfdis.readLine()) != null){
                     String name = "";
           String[] strar = ppfline.split("\\,");
            ArrayList<Integer> ppfval = new ArrayList<Integer>();
            
            for (int ppfcount = 0;ppfcount < strar.length ; ppfcount++){
                
                 if(strar[ppfcount].contains("-")){
                 
                 name = strar[ppfcount];
                }else if(strar[ppfcount].contains("G") ){
                    goalkeeper.put(ppfval,name);

                }else if(strar[ppfcount].contains("M")) {
                    mid.put(ppfval,name);
                }else if(strar[ppfcount].contains("D")) {
                    def.put(ppfval,name);
                }else if(strar[ppfcount].contains("S")) {
                    striker.put(ppfval,name);
                } else if(strar[ppfcount].matches(".*[0-9].*") ){
                 ppfval.add(Integer.parseInt(strar[ppfcount]));
             }

              
             }



                
            }
        

    
        
            
for (ArrayList<Integer> ppcg:goalkeeper.keySet()){
    int tpg = 0;
             
                for (int ppcvalg : ppcg){
                 int ppccountg = 0;
            
                    if(ppccountg == 0){
                        tpg = tpg + (ppcvalg*gg);
                      
                    }else if (ppccountg == 1){
                        tpg = tpg + (ppcvalg*gog);
                       
                    }else if(ppccountg == 2 ){
                        tpg = tpg + (ppcvalg*gt);
                        
                    }else if(ppccountg == 3){
                        tpg = tpg+(ppcvalg*gs);
                       
                    }else if(ppccountg == 4){
                        tpg = tpg + (ppcvalg*gsh);
                        
                    }else if (ppccountg == 5){
                        tpg = tpg + (ppcvalg*yc);
                        
                    }else if (ppccountg== 6){
                        tpg = tpg+ (ppcvalg*rc);
                       
                    }else{
                        
                    

                    }
                    
                    ppccountg += 1;
                
                
                    app.put(goalkeeper.get(ppcg),tpg);
            }
            
        }

       
        
     
           for (ArrayList<Integer> ppcm:mid.keySet()){
            
            int tpm = 0;
            
                for (int ppcvalm : ppcm){

                    int mc = 0;

                    if(mc == 0){
                        tpm = tpm + (ppcvalm*mg);
                     
                    }else if (mc == 1){
                        tpm = tpm + (ppcvalm*mog);
                        
                    }else if(mc == 2 ){
                        tpm = tpm + (ppcvalm*mt);
                        
                    }else if(mc == 4){
                        tpm = tpm + (ppcvalm*ms);
                       
                    }else if (mc == 5){
                        tpm = tpm + (ppcvalm*yc);
                        
                    }else if (mc == 6){
                        tpm = tpm+ (ppcvalm*rc);
                       
                    }else{
                        
                    }

                    mc  = mc + 1;
                    app.put(mid.get(ppcm),tpm);
                
            }
        }
    
       
       

      for (ArrayList<Integer> ppcd:def.keySet()){
         int tpd = 0;
            
                for (int ppcvald : ppcd){
                    int ppccountd = 0;
                    if(ppccountd == 0){
                        tpd = tpd + (ppcvald*dg);

                    }else if (ppccountd == 1){
                        tpd = tpd + (ppcvald*dog);
                    }else if(ppccountd == 2 ){
                        tpd = tpd + (ppcvald*dt);
                    }else if(ppccountd == 4){
                        tpd = tpd + (ppcvald*ds);
                    }else if (ppccountd == 5){
                        tpd = tpd + (ppcvald*yc);
                    }else if (ppccountd == 6){
                        tpd = tpd+ (ppcvald*rc);
                    }else{
                        

                    }
                    ppccountd += 1;
                    app.put(def.get(ppcd),tpd);
                }
            }
        
        for (ArrayList<Integer> ppcs:striker.keySet()){
          int tps = 0;
            

                for (int ppcvals : ppcs){
                   int ppccounts = 0;
                    if(ppccounts == 0){
                        tps = tps + (ppcvals*sg);

                    }else if (ppccounts == 1){
                        tps = tps + (ppcvals*sog);
                    }else if(ppccounts == 2 ){
                        tps = tps + (ppcvals*st);
                    }else if(ppccounts == 4){
                        tps = tps + (ppcvals*ss);
                    }else if (ppccounts == 5){
                        tps = tps + (ppcvals*yc);
                    }else if (ppccounts == 6){
                        tps = tps+ (ppcvals*rc);
                    }else{
                        

                    }
                    ppccounts += 1;
                    app.put(striker.get(ppcs),tps);
                
            }
        }

        

       
        
/*FANTASY--------------------------------------FANTASY----------------------------------------FANTASY-------------------------------------------FANTASY------------------------------------FANTASY---------------------------------------FANTASY--------------*/

                  
HashMap<ArrayList<String>,String> players = new HashMap<ArrayList<String>,String>();
HashMap<String,Integer> finale = new HashMap<String,Integer>();
 HashMap<String,Integer> results = new HashMap<String,Integer>();

  FileWriter myWriter = new FileWriter(new File("result.csv"));
      PrintWriter printWriter = new PrintWriter(myWriter);
DataInputStream myInput;
String csvFile = "teams.csv";

FileInputStream fis = new FileInputStream(csvFile);
            myInput = new DataInputStream(fis);
            String thisLine;
             while ((thisLine = myInput.readLine()) != null) {
                
                ArrayList<String> team = new ArrayList<String>();
                String owner = "";
                String firstname = "";
                String names[] = thisLine.split("\\,");
                for(int j = 0; j<names.length ; j++){
                    
                    
                    if (names[j].contains("@tisb.ac.in")) {
                        owner = names[j];
                        
                    }else if (names[j].contains("-")){
                        team.add(names[j]);
                    }else{
                        firstname = names[j];
                    }

                }
                
                     players.put(team,owner);   
                     namefinder.put(owner,firstname);
                for (ArrayList<String> x : players.keySet()){
                    int teampoints = 0;
                    
                    
                        for(String fpcplayer : x){
                            
                            for(String ppmatch: app.keySet()){
                                
                                if(ppmatch.contains(fpcplayer)){
                                    teampoints = teampoints + app.get(ppmatch);

                                }
                                
                            }
                        }
                        
                     
                    finale.put(players.get(x),teampoints);

                }
                
             }

   
  
  /**/

  for (String em : finale.keySet()){
    String fulln = "";
    for (String ema : namefinder.keySet()){
        if (ema == em){
            fulln = namefinder.get(ema);
        }

    }
    results.put(fulln,finale.get(em));
  }
  

 
       for(String z : finale.keySet()){
        if(z == ""){
        printWriter.println("Name"+","+"Email"+","+"Points");
        System.out.println("Name"+","+"Email"+","+"Points");
        }else{

        printWriter.println(namefinder.get(z) + ","+z+  "," + finale.get(z));
        System.out.println(namefinder.get(z) + ","+z+ "," + finale.get(z));
       }
   }
       printWriter.close();
      


  } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");






        /*END----------------------------END----------------------------END---------------------------END------------------------------END------------------------------END---------------------------------------END_______________________________END_*/
 }	
}      
 

	
	