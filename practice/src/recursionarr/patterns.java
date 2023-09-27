package recursionarr;

public class patterns {

    public static void main(String[] args) {
        pattern2(3,0);
        System.out.println();
        
        
        
    }

    public static void pattern1(int row,int col){
        
        if(row == 0 ) return ;
        if(row>col){
            
            pattern1(row,++col);
            System.out.print("* ");
        }else{

           
            
            pattern1(--row,0);
              System.out.println();
            
        }
}

       public static void pattern2(int row,int col){

          if(row == 0 ) return ;
        if(row>col){
          
              System.out.print("* ");
            pattern2(row,++col);
          
        }else{

           
              System.out.println(); 
            pattern2(--row,0);
           
            
        }
        
    
}
    
}
