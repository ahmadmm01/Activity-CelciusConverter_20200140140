/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMY.TI.A.Activity.Konversi.Suhu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LENOVO
 */

@Controller

public class projectController {
    
    @RequestMapping("/suhu")
    public String getData(HttpServletRequest data, Model dataatt){
        
        processClass proc = new processClass();
        
        String celc = proc.getCelcius(data);
        /*String fahr = proc.getFahrenheit(data);
        String kelv = proc.getKelvin(data);
        String ream = proc.getReamur(data);*/
        
        Double dcelc = proc.getdCelcius(celc);
        Double dfahr = proc.getdFahrenheit(dcelc);
        Double dkelv = proc.getdKelvin(dcelc);
        Double dream = proc.getdReamur(dcelc);
        
        dataatt.addAttribute("celcius", celc);
        /*dataatt.addAttribute("fahrenheit", fahr);
        dataatt.addAttribute("kelvin", kelv);
        dataatt.addAttribute("reamur", ream);*/
        
        dataatt.addAttribute("dcelcius", dcelc);
        dataatt.addAttribute("dfahrenheit", dfahr);
        dataatt.addAttribute("dkelvin", dkelv);
        dataatt.addAttribute("dreamur", dream);
        
        return "viewer";
    }
    
}