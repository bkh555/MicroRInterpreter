// MicroRSyn.java

// This program is a recursive descent parser for MicroR.

public class MicroRSyn {

  public static void main (String args []) throws java.io.IOException {

    System . out . println ("Source Program");
    System . out . println ("--------------");
    System . out . println ();

    SyntaxAnalyzer microRparser = new SyntaxAnalyzer ();
    microRparser . program ();

    System . out . println ();
    System . out . println ("PARSE SUCCESSFUL");
  }

}
