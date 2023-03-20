package fatec.poo.model;

        


public class Aluno {
    private int RA;
    private double ntPvr1;
    private double ntPvr2;
    private double ntTbr1;
    private double ntTbr2;
    
   
     public void setRA(int r){
       RA = r;
    }

    public void setNtPvr1 (double ntPvr1){
           this.ntPvr1 = ntPvr1;
    }

    public void setNtPvr2(double NtPvr2){
        this.ntPvr2 = NtPvr2;
    }

    public void setNtTbr1(double NtTbr1){
        this.ntTbr1= NtTbr1;
    }     

    public void setNtTbr2(double NtTbr2){
        this.ntTbr2 = NtTbr2;
    }
    
    public int getRA(){
        return RA;
    }

    public double getNtPvr1(){
        return ntPvr1;
    }
    
     public double getNtPvr2(){
         return ntPvr2;
     }

      public double getNtTbr1(){
   
        return ntTbr1;
     }

       public double getNtTbr2(){
           return ntTbr2;
       }
           public void setNtTrab2(double ntTbr2) {
        this.ntTbr2 = ntTbr2;
    }
    
    
    public double calcMediaProva(){
        return(0.75  * (ntPvr1 + 2 * ntPvr2)/3);
    }
    
    public double calcMediaTrab(){
        return(0.25 * (ntTbr1 + ntTbr2)/2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    } 

} 

