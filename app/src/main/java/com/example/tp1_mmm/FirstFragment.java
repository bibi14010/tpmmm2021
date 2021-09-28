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
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    public EditText first_name_text;
    public EditText last_name_text;
    public DatePicker date;
    public EditText city ;
    public EditText cellphone;
    public Spinner spinner;

    @Override
    public View onCreateView(

            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        super.setHasOptionsMenu(true);
        return binding.getRoot();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.cellphone = this.getView().findViewById(R.id.cellPhoneInput);
        this.first_name_text = view.getRootView().findViewById(R.id.firstNameTextInput);
        this.last_name_text = view.getRootView().findViewById(R.id.lastNameTextInput);
        this.date = view.getRootView().findViewById(R.id.textDateBirthday);
        this.city = view.getRootView().findViewById(R.id.cityTextInput);

        // Set the array of values in order to be used by the spinner
        this.spinner = view.getRootView().findViewById(R.id.departement_spinner);
        spinner.setPrompt("Selectionner un département");

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity().getBaseContext(),
//                R.array.departements, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);


        binding.button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

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
        Log.i("INFO","onCreateOptionsMenu executed from first fragment");
        // TODO Add your menu entries here
        inflater.inflate(R.menu.menu_first_fragment, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset_action:
                this.resetAllfields();
                return true;
            case R.id.show_action:
                this.showTheSecret();
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    public void resetAllfields(){

        this.first_name_text.setText("");
        this.last_name_text.setText("");
        this.date.updateDate(Calendar.YEAR,Calendar.MONTH,Calendar.DATE);
        this.city.setText("");
    }

    public void showTheSecret(){
        this.cellphone.setVisibility(View.VISIBLE);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}