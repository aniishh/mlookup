package com.example.mlookup.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.mlookup.R;

public class SearchFragment extends Fragment {

    private SearchViewModel searchViewModel;
    private Button btSearch;
    private TextView tvSearch;
    private ScrollView searchResults;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        searchViewModel =
                ViewModelProviders.of(this).get(SearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_search, container, false);
        btSearch = root.findViewById(R.id.btSearch);
        tvSearch = root.findViewById(R.id.etSearch);
        searchResults = root.findViewById(R.id.searchResults);

        btSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return root;
    }
}
