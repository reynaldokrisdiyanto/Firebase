package praktikum.reynaldo.examplefirebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDua extends Fragment {

    View reynaldo;
    TextView textviewEmail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        reynaldo = inflater.inflate(R.layout.activity_fragment_dua, container, false);

        textviewEmail = reynaldo.findViewById(R.id.tampilEmail);
//        textviewEmail.setText("");
        try {
            String apa = getArguments().getString("email");
            textviewEmail.setText(apa);
        }
        catch (Exception E) {

        }

        return reynaldo;
    }
}
