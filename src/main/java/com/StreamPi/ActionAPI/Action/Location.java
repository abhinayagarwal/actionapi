package com.StreamPi.ActionAPI.Action;

public class Location {
    int row,col;

    public Location(int row, int col)
    {
        setLocation(row,col);
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public void setCol(int col)
    {
        this.col = col;
    }

    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
}
