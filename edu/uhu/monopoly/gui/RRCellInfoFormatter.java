package edu.uhu.monopoly.gui;

import edu.uhu.monopoly.Cell;
import edu.uhu.monopoly.Player;
import edu.uhu.monopoly.RailRoadCell;

public class RRCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        RailRoadCell c = (RailRoadCell)cell;
        StringBuffer buf = new StringBuffer();
        Player Propietary = cell.getPropietary();
        String PropietaryName = "";
        if(Propietary != null) {
        	PropietaryName = Propietary.getName();
        }
        buf.append("<html><b><font color='lime'>")
                .append(cell.getName())
                .append("</font></b><br>")
                .append("$").append(c.getPrice())
				.append("<br>Propietary: ").append(PropietaryName)
                .append("</html>");
        return buf.toString();
    }
}
