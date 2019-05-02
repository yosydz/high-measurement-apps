package com.example.camera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class PreviewFragment extends Fragment {
 
    public PreviewFragment() {}
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.preview_fragment, container, false);
        FrameLayout framePreview = (FrameLayout) view.findViewById(R.id.preview);
        framePreview.addView(new CameraPreview(activity, activity.getCamera()));
        return view;
    }
 
}