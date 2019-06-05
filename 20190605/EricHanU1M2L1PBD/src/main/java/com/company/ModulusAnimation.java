package com.company;

public class ModulusAnimation {

    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<20; i++ ) // go through loop 80 times. What ever number we pick (i < 80)  we need to have that many steps
        {
            if ( i%16 == 0 )  // if i mod 10 = 0, remember i goes from 0 to 80. 0 mod 10 is 0.
                System.out.print(" Java                 \r");
            else if ( i%16 == 1 )
                System.out.print("   Java               \r");
            else if ( i%16 == 2 )
                System.out.print("     Java             \r");
            else if ( i%16 == 3 )
                System.out.print("       Java           \r");
            else if ( i%16 == 4 )
                System.out.print("         Java         \r");
            else if ( i%16 == 5 )
                System.out.print("           Java       \r");
            else if ( i%16 == 6 )
                System.out.print("             Java     \r");
            else if ( i%16 == 7 )
                System.out.print("               Java   \r");
            else if ( i%16 == 8 )
                System.out.print("                 Java \r");
            else if ( i%16 == 9 )
                System.out.print("               Java   \r");
            else if ( i%16 == 10 )
                System.out.print("             Java     \r");
            else if ( i%16 == 11 )
                System.out.print("           Java       \r");
            else if ( i%16 == 12 )
                System.out.print("         Java         \r");
            else if ( i%16 == 13 )
                System.out.print("       Java           \r");
            else if ( i%16 == 14 )
                System.out.print("     Java             \r");
            else if ( i%16 == 15 )
                System.out.print("   Java               \r");

            Thread.sleep(200);
        }

    }

}

