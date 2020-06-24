package com.example.courselistfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.courselistfragment.data.Course;
import com.example.courselistfragment.data.CourseArrayAdapter;
import com.example.courselistfragment.data.CourseData;

import java.util.List;

public class myFragment extends ListFragment {
    List<Course> courses = new CourseData().courseList();

    public myFragment (){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CourseArrayAdapter adapter = new CourseArrayAdapter(getActivity(),
                R.layout.course_listitem, courses);

        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.my_fragment, container, false);

        return  view;

    }
}
