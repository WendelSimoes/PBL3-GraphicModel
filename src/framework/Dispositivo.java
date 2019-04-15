package framework;

import java.util.ArrayList;

public abstract class Dispositivo {
    protected ArrayList<Html> html;

    public ArrayList<Html> getHtml() {
        return html;
    }
    
    public abstract void setHtml(ArrayList<Html> html);
}
