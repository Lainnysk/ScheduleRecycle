package com.example.recycv_timetable;

public class Model {
    private String day;
    private String predmet;
    private String predmet1;
    private String predmet2;
    private String predmet3;
    private String predmet4;
    private String prepod;
    private String prepod1;
    private String prepod2;
    private String prepod3;
    private String prepod4;

    public Model(String day,
                 String predmet, String prepod,
                 String predmet1, String prepod1,
                 String predmet2, String prepod2,
                 String predmet3, String prepod3,
                 String predmet4, String prepod4){

        this.day = day;
        this.predmet = predmet;
        this.predmet1 = predmet1;
        this.predmet2 = predmet2;
        this.predmet3 = predmet3;
        this.predmet4 = predmet4;
        this.prepod = prepod;
        this.prepod1 = prepod1;
        this.prepod2 = prepod2;
        this.prepod3 = prepod3;
        this.prepod4 = prepod4;

    }

    public String getDay(){ return day; }
    public String getPredmet(){ return predmet; }
    public String getPredmet1(){ return predmet1; }
    public String getPredmet2(){ return predmet2; }
    public String getPredmet3(){ return predmet3; }
    public String getPredmet4(){ return predmet4; }
    public String getPrepod(){ return prepod; }
    public String getPrepod1(){ return prepod1; }
    public String getPrepod2(){ return prepod2; }
    public String getPrepod3(){ return prepod3; }
    public String getPrepod4(){ return prepod4; }
}
