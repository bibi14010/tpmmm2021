package com.example.tp1_mmm;

import android.appwidget.AppWidgetProvider;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tp1_mmm.databinding.FragmentFirstBinding;
import com.google.android.material.snackbar.Snackbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public void setHasOptionsMenu(boolean hasMenu) {
        super.setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(

            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        setHasOptionsMenu(true);
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText first_name_text = view.getRootView().findViewById(R.id.firstNameTextInput);
                EditText last_name_text = view.getRootView().findViewById(R.id.lastNameTextInput);
                DatePicker date = view.getRootView().findViewById(R.id.textDateBirthday);
                EditText city = view.getRootView().findViewById(R.id.cityTextInput);

                String display_text = "Hello "+first_name_text.getText().toString()+" "+last_name_text.getText().toString()+" !\n";
                display_text +="You are born the "+date.getDayOfMonth()+"/"+ (date.getMonth() + 1)+"/"+date.getYear()+" in "+city.getText().toString()+" !";

                Snackbar.make(view, display_text, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                /*
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
                */
            }
        });

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here
        inflater.inflate(R.menu.menu_first_fragment, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                this.resetAllfields();
                return true;
            case R.id.action_secret:
                this.showTheSecret();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    public void resetAllfields(){

        //EditText first_name_text = view.findViewById(R.id.firstNameTextInput);
        //EditText last_name_text = view.findViewById(R.id.lastNameTextInput);
        //DatePicker date = view.findViewById(R.id.textDateBirthday);
        //EditText city = view.findViewById(R.id.cityTextInput);

        //first_name_text.setText("");
        //last_name_text.setText("");
        //date.updateDate(Calendar.YEAR,Calendar.MONTH,Calendar.DATE);
        //city.setText("");
    }

    public void showTheSecret(){

        //EditText cellphone = this.getView().findViewById(R.id.cellPhoneInput);
        //cellphone.setVisibility(View.VISIBLE);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}