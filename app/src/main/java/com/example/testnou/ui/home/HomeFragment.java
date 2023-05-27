package com.example.testnou.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testnou.Add_item_via_fab;
import com.example.testnou.Edit_item_longClick;
import com.example.testnou.Edit_item_onClick;
import com.example.testnou.R;
import com.example.testnou.SplashScreen;
import com.example.testnou.databinding.FragmentHomeBinding;
import com.example.testnou.onClickImages.monaco;
import com.example.testnou.recyclerView.MyAdapter;
import com.example.testnou.recyclerView.RecyclerViewInterface;
import com.example.testnou.recyclerView.Trips;
import com.example.testnou.ui.contact.ContactFragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements RecyclerViewInterface {

    private ArrayList<Trips> tripsArrayList;
    private String[] tripsHeading;
    private int[] imageResuorceID;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();
        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        MyAdapter myAdapter = new MyAdapter(getContext(), tripsArrayList, this);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialize() {

        tripsArrayList = new ArrayList<>();
        tripsHeading = new String[]{
                getString(R.string.head_1),
                getString(R.string.head_2),
                getString(R.string.head_3),
                getString(R.string.head_4),
                getString(R.string.head_5),
                getString(R.string.head_6),
                getString(R.string.head_7),
                getString(R.string.head_8),
                getString(R.string.head_9),
        };

        imageResuorceID = new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
        };

        for(int i=0;i<tripsHeading.length;i++){
            Trips trips = new Trips(tripsHeading[i], imageResuorceID[i]);
            tripsArrayList.add(trips);
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(HomeFragment.this.getActivity(), Edit_item_onClick.class);
        startActivity(intent);
    }

    @Override
    public void onLongClick(int position) {
        Intent intent = new Intent(HomeFragment.this.getActivity(), Edit_item_longClick.class);
        startActivity(intent);
    }
}