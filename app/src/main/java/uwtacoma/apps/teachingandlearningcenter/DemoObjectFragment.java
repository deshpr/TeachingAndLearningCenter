package uwtacoma.apps.teachingandlearningcenter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

public class DemoObjectFragment extends Fragment {

    public static final String  ARG_NUMBER = "ARG_NUMBER";

    private int myPageNumber;

    public static DemoObjectFragment newInstance(int pageNumber){
        Bundle args = new Bundle();
        args.putInt(ARG_NUMBER, pageNumber);
        DemoObjectFragment fragment = new DemoObjectFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
//        setContentView(R.layout.activity_demo_object_fragmen);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

    }





    @Override
    public View onCreateView(LayoutInflater inflater,
                                      ViewGroup  container,
                                      Bundle savedInstanceState){
        View  fragmentView = inflater.inflate(R.layout.activity_demo_object_fragmen,
                        container, false);
        TextView textView = (TextView)fragmentView.findViewById(R.id.txtView);
        textView.setText("Fragment number = #" + myPageNumber);
        return  fragmentView;
    }


}
