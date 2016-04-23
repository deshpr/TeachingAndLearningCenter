package uwtacoma.apps.teachingandlearningcenter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.os.AsyncTask;
import android.util.Log;

import uwtacoma.apps.teachingandlearningcenter.domain.TLCRepository;

public class WhoIsHereFragment extends Fragment {


        private TextView txtView;


        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.fragment_who_is_here,  viewGroup,false);

            txtView = (TextView)view.findViewById(R.id.txtView);
            new AsyncTask<String, String, String>(){

                @Override
                protected String doInBackground(String... args){
                    TLCRepository repo = new TLCRepository();
                    String tutorResult = repo.getTutors();
                    Log.d(HomeActivity.DEBUG_TAG, "result = " + tutorResult);
                    return tutorResult;
                }
                protected void onPostExecute(String result){
                    // this is in the main thread.
                    txtView.setText(result);
                }
            }.execute();

            return view;
        }

}

