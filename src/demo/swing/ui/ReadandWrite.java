package demo.swing.ui;



import java.io.*;

public class ReadandWrite
{
    public static void main(String[] args) throws IOException
    {
            File person = new File("C: people.txt");
        FileOutputStream z = new FileOutputStream("people.txt");
        ObjectOutputStream zz = new ObjectOutputStream(z);

        }

    }


