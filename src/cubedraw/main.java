package cubedraw;

public class main 
{
    public static void main(String[] args) 
    {
        int height = 4;
        int width  = 10;
        
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
