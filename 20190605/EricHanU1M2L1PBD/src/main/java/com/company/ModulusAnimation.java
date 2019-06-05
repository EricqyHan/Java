package com.company;

public class ModulusAnimation {

    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<80; i++ ) // go through loop 80 times. What ever number we pick (i < 80)  we need to have that many steps
        {
            if ( i%17 == 0 )  // if i mod 10 = 0, remember i goes from 0 to 80. 0 mod 10 is 0.
                System.out.print(" Java                 \r");
            else if ( i%17 == 1 )
                System.out.print("   Java               \r");
            else if ( i%17 == 2 )
                System.out.print("     Java             \r");
            else if ( i%17 == 3 )
                System.out.print("       Java           \r");
            else if ( i%17 == 4 )
                System.out.print("         Java         \r");
            else if ( i%17 == 5 )
                System.out.print("           Java       \r");
            else if ( i%17 == 6 )
                System.out.print("             Java     \r");
            else if ( i%17 == 7 )
                System.out.print("               Java   \r");
            else if ( i%17 == 8 )
                System.out.print("                 Java \r");
            else if ( i%17 == 9 )
                System.out.print("               Java   \r");
            else if ( i%17 == 10 )
                System.out.print("             Java     \r");
            else if ( i%17 == 11 )
                System.out.print("           Java       \r");
            else if ( i%17 == 12 )
                System.out.print("         Java         \r");
            else if ( i%17 == 13 )
                System.out.print("       Java           \r");
            else if ( i%17 == 14 )
                System.out.print("     Java             \r");
            else if ( i%17 == 15 )
                System.out.print("   Java               \r");
            else if ( i%17 == 16 )
                System.out.print(" Java                 \r");

            Thread.sleep(200);
        }

    }

}

