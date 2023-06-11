package com.example.demo_11_06_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weryfikacja {
    private String imie;
    private String nazwisko;

    public boolean czyImiePoprawne(String imie){
        boolean poprawne = true;

        String regex = "[A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(imie);
        poprawne = matcher.matches();

        if(poprawne)
            this.imie = imie;

        return poprawne;
    }

    public boolean czyNazwiskoPoprawne(String nazwisko){
        boolean poprawne = true;

        String regex = "[A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nazwisko);
        poprawne = matcher.matches();

        if(poprawne)
            this.nazwisko = nazwisko;

        return poprawne;
    }


}
