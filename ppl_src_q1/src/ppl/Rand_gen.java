package ppl;
import java.io.*;
import java.util.*;

public class Rand_gen {
	 public static void main(String[] args)throws IOException {
	        File f;
	        FileWriter fw=null;
	        BufferedWriter bw=null;
	        boolean bool;
	        try{
	            f=new File("file.txt");
	            bool=f.createNewFile();
	            fw=new FileWriter("file.txt");
	            bw=new BufferedWriter(fw);
	            int nob, nog;
	            Random rand=new Random();
	            nog=10+rand.nextInt(10);
	            nob=nog+15+rand.nextInt(10);
	            int atr, atr_req, intel, budget, t, main_budget;
	            String name;
	            String type;
	            
	            bw.write(Integer.toString(nob));
	            bw.newLine();
	            for (int i=1;i<=nob;i++){
	                name="boy"+i;
	                bw.write(name);
	                bw.write(",");
	                
	                atr=rand.nextInt(100);
	                bw.write(Integer.toString(atr));
	                bw.write(",");
	                
	                budget=rand.nextInt(100);
	                bw.write(Integer.toString(budget));
	                bw.write(",");
	                
	                intel=rand.nextInt(100);
	                bw.write(Integer.toString(intel));
	                bw.write(",");
	                
	                atr_req=rand.nextInt(100);
	                bw.write(Integer.toString(atr_req));
	                bw.write(",");
	                
	                t=rand.nextInt(3);
	                if (t==0){
	                    type="Miser";
	                }else if(t==1){
	                    type="Generous";
	                }else{
	                    type="Geek";
	                }
	                bw.write(type);
	                bw.newLine();
	            }
	          
	            bw.write(Integer.toString(nog));
	            bw.newLine();
	            for (int i=1;i<=nog;i++){
	                name="girl"+i;
	                bw.write(name);
	                bw.write(",");
	                
	                atr=rand.nextInt(100);
	                bw.write(Integer.toString(atr));
	                bw.write(",");
	                
	                main_budget=rand.nextInt(100);
	                bw.write(Integer.toString(main_budget));
	                bw.write(",");
	                
	                intel=rand.nextInt(100);
	                bw.write(Integer.toString(intel));
	                bw.write(",");
	                
	                t=rand.nextInt(3);
	                if (t==0){
	                    type="Choosy";
	                }else if(t==1){
	                    type="Normal";
	                }else{
	                    type="Desperate";
	                }
	                bw.write(type);
	                bw.newLine();
	            }
	            bw.close();
	            fw.close();
	        }catch(Exception e){
	            
	        }
	        
	    }
	

}
