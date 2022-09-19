package fi.samu.aikio.exercise_6_1;

import java.util.ArrayList;

public class Presidents {
    private static Presidents presidentsInstance;
    private ArrayList<President> presidents = new ArrayList<>();

    public static Presidents getInstance(){
        if (presidentsInstance == null){
            presidentsInstance = new Presidents();
        }
        return presidentsInstance;
    }

    private Presidents(){

    }

    public ArrayList<President> getPresidentsList(){
        return presidents;
    }

    public President getPresident(int value){
        return presidents.get(value);
    }

}
