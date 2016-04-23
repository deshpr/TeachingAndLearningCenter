package uwtacoma.apps.teachingandlearningcenter;

/**
 * Created by Rahul on 4/22/2016.
 */
public interface IBackgroundTask {

    public String doInBackground(String... args);
    public void onPreExecute();
    public void onPostExecute();



}
