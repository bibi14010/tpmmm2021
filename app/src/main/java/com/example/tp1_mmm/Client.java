package com.example.tp1_mmm;

public class Client {

    private String firstNameTextInput;
    private String lastNameTextInput;
    private String textDateBirthday;
    private String cityTextInput;
    private String cellPhoneInput;
    private String departement_spinner;

    public Client(){
        super();
    }

    public Client(String firstNameTextInput, String lastNameTextInput, String textDateBirthday, String cityTextInput, String cellPhoneInput, String departement_spinner) {
        this.firstNameTextInput = firstNameTextInput;
        this.lastNameTextInput = lastNameTextInput;
        this.textDateBirthday = textDateBirthday;
        this.cityTextInput = cityTextInput;
        this.cellPhoneInput = cellPhoneInput;
        this.departement_spinner = departement_spinner;
    }

    public String getFirstNameTextInput() {
        return firstNameTextInput;
    }

    public void setFirstNameTextInput(String firstNameTextInput) {
        this.firstNameTextInput = firstNameTextInput;
    }

    public String getLastNameTextInput() {
        return lastNameTextInput;
    }

    public void setLastNameTextInput(String lastNameTextInput) {
        this.lastNameTextInput = lastNameTextInput;
    }

    public String getTextDateBirthday() {
        return textDateBirthday;
    }

    public void setTextDateBirthday(String textDateBirthday) {
        this.textDateBirthday = textDateBirthday;
    }

    public String getCityTextInput() {
        return cityTextInput;
    }

    public void setCityTextInput(String cityTextInput) {
        this.cityTextInput = cityTextInput;
    }

    public String getCellPhoneInput() {
        return cellPhoneInput;
    }

    public void setCellPhoneInput(String cellPhoneInput) {
        this.cellPhoneInput = cellPhoneInput;
    }

    public String getDepartement_spinner() {
        return departement_spinner;
    }

    public void setDepartement_spinner(String departement_spinner) {
        this.departement_spinner = departement_spinner;
    }
}
