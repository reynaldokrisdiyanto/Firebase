package praktikum.reynaldo.examplefirebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentTiga extends Fragment {

    View reynaldo;
    EditText editEmail, editPassword;
    Button btnLogin;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        reynaldo = inflater.inflate(R.layout.activity_fragment_tiga, container, false);

        editEmail = reynaldo.findViewById(R.id.edtEmail);
        editPassword = reynaldo.findViewById(R.id.edtPassword);
        btnLogin = reynaldo.findViewById(R.id.btnLogin);

        //Menyediakan tempat untuk button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Anda Masuk", Toast.LENGTH_SHORT).show();

                String inputEmail = editEmail.getText().toString();
                String inputPassword = editPassword.getText().toString();

                //Mengirimkan data
                Bundle bnd = new Bundle();
                FragmentDua frm2 = new FragmentDua();

                //Membuka bungkus email
                bnd.putString("email", inputEmail);
                frm2.setArguments(bnd);

                //Menempelkan fragment
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame2, frm2);
                ft.commit();
            }
        });

        return reynaldo;
    }
}
