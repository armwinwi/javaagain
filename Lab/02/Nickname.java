

public class Nickname {
    public static void main(String[] args) {
       int row,col,space=1; // row = แถว col = column space = ที่ว่าง
       for(row=1;row<=5;row++){
        for(col=1;col<=5;col++){ //Print A
            if(col==1 || col==5 || row==1 || row==3)
                System.out.print(" * ");
            else 
                System.out.print("   ");
        }
        for(space=1;space<=3;space++){
            System.out.print(" ");
        }
        for(col=1;col<=5;col++){ //Print R
            if(col==1 || row==1 || row==3 || (col==5 && row<= 3) || (row==col && col>3))
                System.out.print(" * ");
            else 
                System.out.print("   ");
        }
        for(space=1;space<=3;space++){
            System.out.print(" ");
        }
        for(col=1;col<=5;col++){ //Print M
            if(col==1 || col==5 || (row==3 && col==3) || (row==2 && col==2) || (row==2 && col==4))
                System.out.print(" * ");
            else 
                System.out.print("   ");
        }
        for(space=1;space<=3;space++){
            System.out.print(" ");
        }
        
        System.out.println();
       }

    }
    
}
