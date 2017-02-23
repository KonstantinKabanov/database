import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Костя on 23.02.2017.
 */
public class Phones extends AbstractTableModel {
    private static final int Phone = 1;

    private String[] columnNames = {"phone"};

    private List<number> numbers;

    public Phones(List<number> theNumber){
        numbers = theNumber;
    }


    @Override
    public int getRowCount() {
        return numbers.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        number tempNumber = numbers.get(row);

        switch (column){
            case Phone:
                return tempNumber.getPhone();
        }

}
}
