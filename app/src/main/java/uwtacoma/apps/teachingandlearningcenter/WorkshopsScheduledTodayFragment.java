package uwtacoma.apps.teachingandlearningcenter;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;


/**
 * Created by Rahul on 4/22/2016.
 */
public class WorkshopsScheduledTodayFragment extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View v = inflater.inflate(R.layout.fragment_workshops_today, container, false);
            return v;
        }
}
