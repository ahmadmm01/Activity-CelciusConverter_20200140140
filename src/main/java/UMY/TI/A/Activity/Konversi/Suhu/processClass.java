/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UMY.TI.A.Activity.Konversi.Suhu;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author LENOVO
 */
public class processClass {
    
    public String getCelcius(HttpServletRequest data){
        String Celcius = data.getParameter("var_celcius");
        return Celcius;
    }
    /*public String getFahrenheit(HttpServletRequest data){
        String Fahrenheit = data.getParameter("var_fahrenheit");
        return Fahrenheit;
    }
    public String getKelvin(HttpServletRequest data){
        String Kelvin = data.getParameter("var_kelvin");
        return Kelvin;
    }
    public String getReamur(HttpServletRequest data){
        String Reamur = data.getParameter("var_reamur");
        return Reamur;
    }*/
    
    public Double getdCelcius(String Celcius){
        Double dCelcius = Double.valueOf(Celcius);
        return dCelcius;
    }
    public Double getdFahrenheit(/*String Fahrenheit, */Double dCelcius){
        //Double dFahrenheit = Double.valueOf(Fahrenheit);
        Double dFahrenheit = dCelcius * 9/5 + 32;
        return dFahrenheit;
    }
    public Double getdKelvin(/*String Kelvin, */Double dCelcius){
        //Double dKelvin = Double.valueOf(Kelvin);
        Double dKelvin = dCelcius + 273.15;
        return dKelvin;
    }
    public Double getdReamur(/*String Reamur, */Double dCelcius){
        //Double dReamur = Double.valueOf(Reamur);
        Double dReamur = dCelcius * 0.8;
        return dReamur;
    }
    
    
}