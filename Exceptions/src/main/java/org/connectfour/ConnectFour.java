package org.connectfour;

public class ConnectFour {

    private static final int ROWS = 6;
    private static final int COLS = 7;
    private String[][] board = new String[ROWS][COLS];
    private static String [][] exampleBoard =
            {{"", "", "", "", "", "", ""},
                    {"", "", "", "", "", "", ""},
                    {"", "", "R", "", "", "", ""},
                    {"", "", "R", "Y", "", "", ""},
                    {"", "", "R", "R", "Y", "", ""},
                    {"", "", "R", "R", "Y", "Y", ""}};
}
