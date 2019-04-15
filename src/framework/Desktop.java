package framework;

import java.util.ArrayList;

public class Desktop extends Dispositivo {  
    @Override
    public void setHtml(ArrayList<Html> html) {
        int i;
        for(i = 0; i < html.size(); i++){
            if(html.get(i) instanceof Lista || html.get(i) instanceof Paragrafo){
                html.get(i).setTamanho(html.get(i).getTamanho() + ((150*html.get(i).getTamanho())/100));
            }
            if(html.get(i) instanceof Link){
                html.get(i).setTamanho(html.get(i).getTamanho() + ((120*html.get(i).getTamanho())/100));
            }
        }
        this.html = html;
    }
}
