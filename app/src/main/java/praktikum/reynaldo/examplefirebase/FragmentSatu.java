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

public class FragmentSatu extends Fragment {

    View reynaldo;
    Button login, signup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        reynaldo = inflater.inflate(R.layout.activity_fragment_satu, container, false);

        login = reynaldo.findViewById(R.id.btnLogin1);
        signup = reynaldo.findViewById(R.id.btnsignup1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame3, new FragmentTiga());    //Menempel ke frame layout 3
                ft.commit();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame3, new FragmentEmpat());    //Menempel ke frame layout 3
                ft.commit();
            }
        });

        return reynaldo;
    }
}
