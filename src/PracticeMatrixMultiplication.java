public class PracticeMatrixMultiplication {
    public static void main(String[] args)
    {
        int[][] m1={
                {2,4},
                {6,1}
                // {10,5,2}
        };
        int[][] m2={
                {2,8},
                {6,1}
                // {7,5,2}
        };


        if(m1[1].length == m2.length)// To Find if multiplication is possible
        {
            int[][] result=new int[m1.length][m2[1].length];//Maths property to determine resultant matrix lenghth.

            for(int i=0;i<result.length;i++)// to iterate rows
            {
                for(int x=0;x<result[i].length;x++)// to iterate cols of result matrix
                {

                    for(int j=0;j<result[i].length;j++)// to iterate columns
                    {
                        result[i][x]+=m1[i][j]*m2[j][x];
                    }
                }
            }

            for(int i=0;i<m2.length;i++)
            {
                for(int j=0;j<m1[i].length;j++)
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }




    }
}
