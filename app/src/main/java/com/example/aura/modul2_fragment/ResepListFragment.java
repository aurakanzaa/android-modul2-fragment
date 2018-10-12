package com.example.aura.modul2_fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ResepListFragment extends ListFragment {


    public ResepListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[Resep.resepmakanan.length];
        for (int i = 0; i < names.length; i++){
            names[i] = Resep.resepmakanan[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {

        super.onListItemClick(listView, itemView, position, id);
        Toast.makeText(getActivity(), "Item "+position+ " klik", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(itemView.getContext(), DetailActivity.class);
        Bundle b = new Bundle();
        String[] names = new String[Resep.resepmakanan.length];
        b.putInt("id", position);
        i.putExtras(b);
        startActivity(i);
    }
}
