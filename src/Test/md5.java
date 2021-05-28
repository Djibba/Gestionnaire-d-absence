/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author seck
 */
public class md5
{
    
    public  String hachPassword(String passwordToHash){
       
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return(generatedPassword);
        
    }
    public String []JourHeure()
    {
      
    Date aujourdhui = new Date();
    DateFormatSymbols monDFS = new DateFormatSymbols();
    String[] joursCourts = new String[] {
        "",
        "6",
        "0",
        "1",
        "2",
        "3",
        "4",
        "5" };
    monDFS.setShortWeekdays(joursCourts);
    SimpleDateFormat dateFormat = new SimpleDateFormat(
        "EEE HH",
        monDFS);
    String str[] = dateFormat.format(aujourdhui).split(" ");
    
    return str;
   
  }
     public String getDate(){
         SimpleDateFormat formater = null;
         Date aujourdhui = new Date();
         formater = new SimpleDateFormat("yyyy-MM-dd");
         return formater.format(aujourdhui);
     }

    

}