package dev.ofiucoder.myarmstrongnumber;

import java.lang.ModuleLayer.Controller;

import dev.ofiucoder.myarmstrongnumber.Controller.ControllerArmstrong;
import dev.ofiucoder.myarmstrongnumber.views.View;

public final class App {

    public static void main(String[] args) {
        View view = new View();
        int numb = view.index(); 
        
        ControllerArmstrong.validaArmstrongNumber(numb);
        
    }
}
