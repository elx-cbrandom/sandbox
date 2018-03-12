package dev.test;

public class Shovel {
    public static void main( String[] args ) {
        try {
            Shovel shovel = new Shovel();
            shovel.dig();
        }
        catch( Exception e ) {
            e.printStackTrace();
        }
    }

    private void dig() {
        System.out.println( "Can you dig it?" );
    }
}
