package ppl;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws FileNotFoundException {
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader("file.txt");
            br=new BufferedReader(fr);
            ArrayList <Boy> boy_arr=new ArrayList<>();
            ArrayList <Girl> girl_arr=new ArrayList<>();
            ArrayList <Couple> couple_arr=new ArrayList<>();
            int nob, nog;
            int intel_level, attractiveness, required_att, budget,maintenance;
            int i;
            String name;
            String type;
            String str;
            //Read Boys Info
            Boy boy;
            nob=Integer.parseInt(br.readLine());
            for (i=1;i<=nob;i++){
                str=br.readLine();
                StringTokenizer st=new StringTokenizer(str, ",");
                name=st.nextToken();
                attractiveness=Integer.parseInt(st.nextToken());
                budget=Integer.parseInt(st.nextToken());
                intel_level=Integer.parseInt(st.nextToken());
                required_att=Integer.parseInt(st.nextToken());
                type=st.nextToken();
                boy= new Boy(name, budget, attractiveness, intel_level, required_att,type);
                boy_arr.add(boy);
            }
            Girl girl;
            nog=Integer.parseInt(br.readLine());
            for (i=1;i<=nog;i++){
                str=br.readLine();
                StringTokenizer st=new StringTokenizer(str, ",");
                name=st.nextToken();
                attractiveness=Integer.parseInt(st.nextToken());
                maintenance=Integer.parseInt(st.nextToken());
                intel_level=Integer.parseInt(st.nextToken());
                type=st.nextToken();
                girl= new Girl(name, attractiveness, maintenance, intel_level, type);
                girl_arr.add(girl);
            }
            
            Couple couple;
            int j, k;
            for (i=0, k=0;i<nob;i++){
                for (j=0;j<nog;j++){
                    if (girl_arr.get(j).relationship_status==false && boy_arr.get(i).required_att<=girl_arr.get(j).attractiveness && boy_arr.get(i).budget>=girl_arr.get(j).maintenance){
                        boy_arr.get(i).relationship_status=true;
                        girl_arr.get(j).relationship_status=true;
                        couple=new Couple(boy_arr.get(i), girl_arr.get(j));
                        couple_arr.add(couple);
                        k++;
                        break;
                    }
                }
            }
            
            for (i=0;i<k;i++){
                System.out.println(couple_arr.get(i).name);
            }
        }catch(IOException | NumberFormatException e){
            
        }
    }

}
