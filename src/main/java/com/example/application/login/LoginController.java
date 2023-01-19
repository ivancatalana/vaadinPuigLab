package com.example.application.login;


import java.io.*;

public class LoginController {
    File f = new File("src/main/resources/BD.txt");
    FileReader fr = new FileReader(f);
    BufferedReader bf = new BufferedReader(fr);

    public LoginController() throws FileNotFoundException {
    }


    public boolean logg(String value, String value1) throws IOException {
        boolean log = false;
        String linea = bf.readLine();
        while (linea!=null){
            String[] pp = linea.split(",");
            if(pp[0].equals(value) && pp[1].equals(value1)){
                return true;
            }
            linea=bf.readLine();
        }
        return log;
    }
}
