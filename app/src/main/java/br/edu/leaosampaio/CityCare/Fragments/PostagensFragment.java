package br.edu.leaosampaio.CityCare.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.edu.leaosampaio.CityCare.Adapter.PostAdapter;
import br.edu.leaosampaio.CityCare.DAO.DenunciaDAO;
import br.edu.leaosampaio.CityCare.Modelo.Denuncia;
import br.edu.leaosampaio.CityCare.R;

/**
 * Created by lab1-18 on 12/06/17.
 */

public class PostagensFragment extends Fragment {

    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.postagem_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.post_recyclerView);

        DenunciaDAO denunciaDAO = new DenunciaDAO(getContext());

        List<Denuncia> denuncias = denunciaDAO.buscar();

        PostAdapter pAdapter = new PostAdapter(denuncias, getContext());

        recyclerView.setAdapter(pAdapter);

        LinearLayoutManager layout = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
    }
}
