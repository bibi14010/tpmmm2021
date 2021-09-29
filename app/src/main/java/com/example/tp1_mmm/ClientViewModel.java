package com.example.tp1_mmm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ClientViewModel extends BaseObservable {
    private Client model;
    @Bindable
    public String getFirstNameTextInput(){
        return this.model.getFirstNameTextInput();
    }
    public void setFirstNameTextInput(String firstNameTextInput){
        this.model.setFirstNameTextInput(firstNameTextInput);
    }
}
