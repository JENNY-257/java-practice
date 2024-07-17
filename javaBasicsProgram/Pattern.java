public class Pattern {
    public static void main(String[] args){

        // print right triagle shape using stars

        int row, column, numberOfRows=6;
        for(row=0; row<numberOfRows; row++)
        {
          for(column=0; column<=row; column++)
          {
            System.out.print("* ");
          }
          //This is just to print the stars in new line after each row
          System.out.println();
        }

        // to print left triangle
        for(row =0; row<numberOfRows;row++){
          for(column = 2 *(numberOfRows-row);column>2; column--)
          {
                System.out.print(" ");
       
           }
           for(column=0;column<=row; column++)
           {
            System.out.print("*");
           }
           System.out.println();
        }

    }
}
