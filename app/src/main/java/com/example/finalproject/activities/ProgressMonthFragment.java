package com.example.finalproject.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProgressMonthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProgressMonthFragment extends Fragment {
    private MaterialCalendarView calendar;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProgressMonthFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProgressMonthFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProgressMonthFragment newInstance(String param1, String param2) {
        ProgressMonthFragment fragment = new ProgressMonthFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static ProgressMonthFragment newInstance(String idHabit, String idTaiKhoan, String test) {
        ProgressMonthFragment fragment = new ProgressMonthFragment();
        Bundle args = new Bundle();
        args.putString("idHabit", idHabit);
        args.putString("idTaiKhoan", idTaiKhoan);
        args.putString("test", test);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress_month, container, false);
        // Lấy dữ liệu
        String idHabit = getArguments().getString("idHabit");
        String idTaiKhoan = getArguments().getString("idTaiKhoan");
        Log.d("idHabit m", idHabit);
        Log.d("idTaiKhoan m", idTaiKhoan);
        calendar = view.findViewById(R.id.calendarView);
        setupCalendar();
        // Inflate the layout for this fragment
        return view;
    }

    private void setupCalendar() {
        calendar.setSelectionMode(MaterialCalendarView.SELECTION_MODE_MULTIPLE);
        calendar.setDateSelected(CalendarDay.today(), true);
        calendar.setDateSelected(CalendarDay.from(2024, 3, 20), true);
        calendar.setDateSelected(CalendarDay.from(2024, 3, 21), true);


    }
}