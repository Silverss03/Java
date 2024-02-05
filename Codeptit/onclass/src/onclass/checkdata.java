/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

/**
 *
 * @author Admin
 */
public class checkdata {
    public boolean isMa(String ma){
        try{
            if(ma.toUpperCase().matches("^B\\d{2}DC(CN|AT)\\d{3}$")){
                return true ;
            }else{
                throw new validateexception("ma sv ko hop le") ;
            }
        }
        catch(validateexception e){
            System.out.println(e);
        }
        return false ;
    }
    public boolean isTuoi(String tuoi) throws validateexception{
        if(tuoi.matches("^\\d+")){
            return true ;
        }
        else{
            throw new validateexception("tuoi ko hop le") ;
        }
    }
}
