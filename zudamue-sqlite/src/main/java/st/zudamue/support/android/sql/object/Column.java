package st.zudamue.support.android.sql.object;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xdaniel on 12/30/16.
 *
 *  @author Daniel Costa <costa.xdaniel@gmail.com>
 */

public class Column extends Identifier {

    private List<Object> arguments;

    public Column(String name) {
        super(name);
        this.arguments = new LinkedList<>();
    }

    @Override
    public List<Object> arguments() {
        return Collections.unmodifiableList(this.arguments);
    }

    public static Column column(String name){
        return new Column(name);
    }
}
