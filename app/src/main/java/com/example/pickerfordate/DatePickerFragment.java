package com.example.pickerfordate;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import android.widget.DatePicker;


import java.util.Calendar;


public class DatePickerFragment extends DialogFragment
                implements DatePickerDialog.OnDateSetListener {



    public DatePickerFragment() {

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final java.util.Calendar c = java.util.Calendar.getInstance();
        int year = c.get(java.util.Calendar.YEAR);
        int month = c.get(java.util.Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker,
                          int year, int month, int dayOfMonth) {
        MainActivity activity = (MainActivity) getActivity();
        activity.processDatePickerResult(year, month, dayOfMonth);

    }
}
