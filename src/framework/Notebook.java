package framework;

import java.util.ArrayList;

public class Notebook extends Dispositivo{  
    @Override
    public void setHtml(ArrayList<Html> html) {
        int i;
        for(i = 0; i < html.size(); i++){
            html.get(i).setTamanho(html.get(i).getTamanho()*2);
        }
        this.html = html;
    }
}