package com.juniorua;

/**
 * Created by asu on 02.05.2016.
 */
public class MapCreate {

    private static Cell[][] cells;
    public static Cell currentCell;
    public static int row, col;


    public static void mapCreate() {
        cells = new Cell[][] {
                {new Cell(null,Things.SOURCE,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,Things.STONE,TextHub.CELL_0_0_GREETING_TEXT) },
                {new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(Entities.GNOME,null,TextHub.CELL_0_0_GREETING_TEXT), new Cell(null, null, TextHub.CELL_0_0_GREETING_TEXT)},
                {new Cell(null,Things.BOOK,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,Things.CCOMPIL,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,Things.JAVAC,TextHub.CELL_0_0_GREETING_TEXT), new Cell(Entities.WARDER,null,TextHub.CELL_0_0_GREETING_TEXT)},
                {new Cell(Entities.WIZARD,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT),new Cell(null,null,TextHub.CELL_0_0_GREETING_TEXT), new Cell(Entities.DRAGON,null,TextHub.CELL_0_0_GREETING_TEXT)}
        };
    }

    public static Cell getCurrentCell() {
        return currentCell;
    }
    public static void setCurrentCell(int r, int c) {
        currentCell = cells[r][c];
        col = c;
        row = r;
    }

    public static Cell[][] getCells() {
        return cells;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
