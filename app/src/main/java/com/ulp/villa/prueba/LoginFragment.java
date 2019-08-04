package com.ulp.villa.prueba;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class LoginFragment extends Fragment {

    Button btnFace, btnGoogle, btnInvitado;
    FragmentManager fragmentManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        btnFace = (Button) v.findViewById(R.id.btnFacebookLogin);
        btnGoogle = (Button) v.findViewById(R.id.btnGoogleLogin);
        btnInvitado = (Button)v.findViewById(R.id.btnInvitado);

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Inicio de sesion con Facebook", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Inicio de sesion por Google", Toast.LENGTH_SHORT).show();
            }
        });

        btnInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fragmentManager.beginTransaction().replace(R.id.contenedor, new TwoFragment(), "Fragment 2").commit();
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.contenedor, new TwoFragment(), "FragmentTwo");
                fr.commit();
            }
        });

        return v;

    }
}
