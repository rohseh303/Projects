
/**
 * Write a description of class R729 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class R729
{
    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLUMNS; j++)
        {
        values[i][j] = 0;
        }
    }
    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLUMNS; j++)
        {
            values[i][j] = (i + j) % 2;
        }
    }
    for (int j = 0; j < COLUMNS; j++)
    {
        values[0][j] = 0;
        values[ROWS - 1][j] = 0;
    }
    
    int sum = 0;
    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLUMNS; j++)
        {
            sum = sum + values[i][j];
        }
    }
    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLUMNS; j++)
        {
            System.out.print(values[i][j] + " ");
        }
        
        System.out.println();
    }
}
