package framework;

import java.util.ArrayList;

public class Celular extends Dispositivo {
    @Override
    public void setHtml(ArrayList<Html> html) {
        int i;
        for(i = 0; i < html.size(); i++){
            html.get(i).setTamanho(html.get(i).getTamanho() - ((30*html.get(i).getTamanho())/100));
        }
        this.html = html;
    }  
}


